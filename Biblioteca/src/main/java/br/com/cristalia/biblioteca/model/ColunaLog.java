/*
 * Copyright (C) 2018 rafael.lopes
 *
 * Este programa é um software livre: você pode redistribuí-lo e / ou modificar
 * sob os termos da GNU General Public License, conforme publicado pela
 * a Free Software Foundation, seja a versão 3 da Licença, quanto
 * qualquer versão posterior.
 *
 * Este programa é distribuído na esperança de que seja útil,
 * mas SEM QUALQUER GARANTIA; sem a garantia implícita de
 * COMERCIALIZAÇÃO OU APTIDÃO PARA UM PROPÓSITO PARTICULAR. Veja o
 * GNU General Public License para obter mais detalhes.
 *
 * Você deve ter recebido uma cópia da GNU General Public License
 *  juntamente com este programa. Caso contrário, veja <http://www.gnu.org/licenses/>.
 */
package br.com.cristalia.biblioteca.model;

import br.com.cristalia.biblioteca.audit.Audit;
import br.com.cristalia.biblioteca.audit.AuditListener;
import br.com.cristalia.biblioteca.interfaces.EntidadeBase;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

/**
 * O <code>ColunaLog</code> classe ColunaLog
 *
 * @author rafae.lopes
 * @version 1.00
 */
@Entity
@Table(name = "tb_coluna_log")
@NamedQueries({
    @NamedQuery(name = "ColunaLog.findAll", query = "SELECT colLog FROM ColunaLog colLog")})
@DynamicInsert(true)
@DynamicUpdate(true)
@Audited(withModifiedFlag = true)
@AuditTable(value = "tba_coluna_config_auditoria")
@EntityListeners(AuditListener.class)
public class ColunaLog implements EntidadeBase, Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "coluna_util_id", referencedColumnName = "id")
    private ColunaUtil colunaUtil;

    @ManyToOne()
    @JoinColumn(name = "usuario_inicio_id", referencedColumnName = "id")
    private Usuario usuarioInicio;

    @ManyToOne()
    @JoinColumn(name = "usuario_fim_id", referencedColumnName = "id")
    private Usuario usuarioFim;

    @Column(name = "data_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicio;

    @Column(name = "data_fim")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFim;

    @Column(name = "sentido")
    private Boolean sentido;

    @Column(name = "precoluna")
    private Boolean precoluna;

    @Column(name = "prefiltro")
    private Boolean prefiltro;

    @Column(name = "injecoes")
    private Integer injecoes;

    @ManyToOne()
    @JoinColumn(name = "campanha_id", referencedColumnName = "id")
    private Campanha campanha;

    @Column(name = "obs")
    private String obs;

    @ManyToOne()
    @JoinColumn(name = "anexo_id", referencedColumnName = "id")
    private Arquivos anexo;

    @Column(name = "version")
    private Integer version;

    @Transient
    private Audit audit = new Audit();

    @Transient
    private Boolean ColunaUtil_MOD;

    @Transient
    private Boolean Cromatografo_MOD;

    @Transient
    private Boolean Tipo_MOD;

    @Transient
    private Boolean UsuarioInicio_MOD;

    @Transient
    private Boolean UsuarioFim_MOD;

    @Transient
    private Boolean DataInicio_MOD;

    @Transient
    private Boolean DataFim_MOD;

    @Transient
    private Boolean Sentido_MOD;

    @Transient
    private Boolean Precoluna_MOD;

    @Transient
    private Boolean Prefiltro_MOD;

    @Transient
    private Boolean Injecoes_MOD;

    @Transient
    private Boolean campanha_MOD;

    @Transient
    private Boolean CampanhaId_MOD;

    @Transient
    private Boolean Obs_MOD;

    @Transient
    private Boolean Anexo_MOD;

    public ColunaLog() {
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ColunaUtil getColunaUtil() {
        return colunaUtil;
    }

    public void setColunaUtil(ColunaUtil colunaUtil) {
        this.colunaUtil = colunaUtil;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Campanha getCampanha() {
        return campanha;
    }

    public void setCampanha(Campanha campanha) {
        this.campanha = campanha;
    }

    public Boolean getSentido() {
        return sentido;
    }

    public void setSentido(Boolean sentido) {
        this.sentido = sentido;
    }

    public Boolean getPrecoluna() {
        return precoluna;
    }

    public void setPrecoluna(Boolean precoluna) {
        this.precoluna = precoluna;
    }

    public Boolean getPrefiltro() {
        return prefiltro;
    }

    public void setPrefiltro(Boolean prefiltro) {
        this.prefiltro = prefiltro;
    }

    public Usuario getUsuarioInicio() {
        return usuarioInicio;
    }

    public void setUsuarioInicio(Usuario usuarioInicio) {
        this.usuarioInicio = usuarioInicio;
    }

    public Usuario getUsuarioFim() {
        return usuarioFim;
    }

    public void setUsuarioFim(Usuario usuarioFim) {
        this.usuarioFim = usuarioFim;
    }

    public Integer getInjecoes() {
        return injecoes;
    }

    public void setInjecoes(Integer injecoes) {
        this.injecoes = injecoes;
    }

    public Arquivos getAnexo() {
        return anexo;
    }

    public void setAnexo(Arquivos anexo) {
        this.anexo = anexo;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public Boolean getColunaUtil_MOD() {
        return ColunaUtil_MOD;
    }

    public void setColunaUtil_MOD(Boolean ColunaUtil_MOD) {
        this.ColunaUtil_MOD = ColunaUtil_MOD;
    }

    public Boolean getCromatografo_MOD() {
        return Cromatografo_MOD;
    }

    public void setCromatografo_MOD(Boolean Cromatografo_MOD) {
        this.Cromatografo_MOD = Cromatografo_MOD;
    }

    public Boolean getTipo_MOD() {
        return Tipo_MOD;
    }

    public void setTipo_MOD(Boolean Tipo_MOD) {
        this.Tipo_MOD = Tipo_MOD;
    }

    public Boolean getUsuarioInicio_MOD() {
        return UsuarioInicio_MOD;
    }

    public void setUsuarioInicio_MOD(Boolean UsuarioInicio_MOD) {
        this.UsuarioInicio_MOD = UsuarioInicio_MOD;
    }

    public Boolean getUsuarioFim_MOD() {
        return UsuarioFim_MOD;
    }

    public void setUsuarioFim_MOD(Boolean UsuarioFim_MOD) {
        this.UsuarioFim_MOD = UsuarioFim_MOD;
    }

    public Boolean getDataInicio_MOD() {
        return DataInicio_MOD;
    }

    public void setDataInicio_MOD(Boolean DataInicio_MOD) {
        this.DataInicio_MOD = DataInicio_MOD;
    }

    public Boolean getDataFim_MOD() {
        return DataFim_MOD;
    }

    public void setDataFim_MOD(Boolean DataFim_MOD) {
        this.DataFim_MOD = DataFim_MOD;
    }

    public Boolean getSentido_MOD() {
        return Sentido_MOD;
    }

    public void setSentido_MOD(Boolean Sentido_MOD) {
        this.Sentido_MOD = Sentido_MOD;
    }

    public Boolean getPrecoluna_MOD() {
        return Precoluna_MOD;
    }

    public void setPrecoluna_MOD(Boolean Precoluna_MOD) {
        this.Precoluna_MOD = Precoluna_MOD;
    }

    public Boolean getPrefiltro_MOD() {
        return Prefiltro_MOD;
    }

    public void setPrefiltro_MOD(Boolean Prefiltro_MOD) {
        this.Prefiltro_MOD = Prefiltro_MOD;
    }

    public Boolean getInjecoes_MOD() {
        return Injecoes_MOD;
    }

    public void setInjecoes_MOD(Boolean Injecoes_MOD) {
        this.Injecoes_MOD = Injecoes_MOD;
    }

    public Boolean getCampanha_MOD() {
        return campanha_MOD;
    }

    public void setCampanha_MOD(Boolean campanha_MOD) {
        this.campanha_MOD = campanha_MOD;
    }

    public Boolean getCampanhaId_MOD() {
        return CampanhaId_MOD;
    }

    public void setCampanhaId_MOD(Boolean CampanhaId_MOD) {
        this.CampanhaId_MOD = CampanhaId_MOD;
    }

    public Boolean getObs_MOD() {
        return Obs_MOD;
    }

    public void setObs_MOD(Boolean Obs_MOD) {
        this.Obs_MOD = Obs_MOD;
    }

    public Boolean getAnexo_MOD() {
        return Anexo_MOD;
    }

    public void setAnexo_MOD(Boolean Anexo_MOD) {
        this.Anexo_MOD = Anexo_MOD;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ColunaLog other = (ColunaLog) obj;
        return Objects.equals(this.id, other.id);
    }

}
