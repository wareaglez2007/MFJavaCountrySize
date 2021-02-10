/**
 * 
 */
package org.example.DAO;
import java.util.List;

import org.example.Entities.Country;

/**
 * @author Administrator
 *
 */
public interface CountriesDAO {

	public List<Country> getCountriesBySize() throws Exception;
	
	public String[] fileHeaders(String title);
}
