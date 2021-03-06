/*
 * Copyright (C) 2017 rafael.lopes
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.cristalia.biblioteca.util;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author rafael.lopes
 */
public class ComboBox {

    public static Long getKeyForValue(String value, TreeMap<Long, String> category) {
        for (Map.Entry<Long, String> entry : category.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return 0L;
    }
    
    public static String getStringForValue(String value, TreeMap<String, String> category) {
        for (Map.Entry<String, String> entry : category.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return "";
    }
}
