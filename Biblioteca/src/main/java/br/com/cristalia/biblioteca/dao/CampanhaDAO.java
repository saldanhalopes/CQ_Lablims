package br.com.cristalia.biblioteca.dao;

import br.com.cristalia.biblioteca.connection.ConnectionFactory;
import br.com.cristalia.biblioteca.model.Campanha;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

/**
 *
 * @author rafael
 */
public class CampanhaDAO extends GenenicoDAO<Campanha> {

    public List<Campanha> findListCampanha(Integer maxResults,
            String conditional) throws Exception {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery();
            Root<Campanha> root = cq.from(Campanha.class);
            root.fetch("metodologia", JoinType.INNER);
            root.fetch("analise", JoinType.INNER);
            cq.orderBy(cb.desc(root.get("id")));
            cq.select(root);
            Query q = em.createQuery(cq);
            if (maxResults != null) {
                q.setMaxResults(maxResults);
            }
            return q.getResultList();
        } catch (Exception ex) {
            throw new Exception(ex);
        } finally {
            em.close();
        }
    }

    public Campanha findCampanhaById(Long id) throws Exception {
        EntityManager em = ConnectionFactory.em();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery();
            Root<Campanha> root = cq.from(Campanha.class);
            root.fetch("metodologia", JoinType.INNER);
            root.fetch("analise", JoinType.INNER);
            cq.where(cb.equal(root.get("id"), id));
            cq.select(root);
            TypedQuery<Campanha> q = em.createQuery(cq);
            return q.getSingleResult();
        } catch (Exception ex) {
            throw new Exception(ex);
        } finally {
            em.close();
        }
    }

}
