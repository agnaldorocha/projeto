package br.sigede.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.ejb.EntityManagerImpl;

import javax.persistence.TypedQuery;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class DAOGenerico<T> {

	protected final EntityManager em;
    private final Class<T> classe; 
    
	protected static Log log = LogFactory.getLog(DAOGenerico.class);
      
	public DAOGenerico(EntityManager em, Class<T> classe) {  
		this.em = em;
		this.classe = classe;  
	}  
	      
	public EntityManager getEntityManager(){
		if(em == null){
			throw new IllegalStateException("Erro");
		}
		return em;
	}
	
	public Session getHibernateSession(){
		Session session;  
		if (getEntityManager().getDelegate() instanceof EntityManagerImpl) {  
		    EntityManagerImpl entityManagerImpl = (EntityManagerImpl) getEntityManager().getDelegate();  
		    session = entityManagerImpl.getSession();  
		} else {  
		    session = (Session) getEntityManager().getDelegate();  
		}
		return session;
	}
	
	public T update(T objeto) {
		try {
			T obj = getEntityManager().merge(objeto);
			getEntityManager().flush();
			return obj;
		} catch (Exception e) {
			System.out.println("\nData da exceção: " + new Date());
			log.error("\nDao.atualizar:\t erro \n\t"+e.getMessage());
			return null;
		}
	}

	public T add(T objeto) {
		try {
			getEntityManager().clear();
			getEntityManager().persist(objeto);
			getEntityManager().flush();
			return objeto;
		} catch (Exception e) {
			System.out.println("\nData da exceção: " + new Date());
			log.error("\nDao:\t erro salvando \n\t"+e.getMessage());
			System.out.println("\nDao:\t erro salvando \n\t"+e.getMessage());
			return null;
		}
	}

	public void delete(T objeto) {
		try {
			objeto = getEntityManager().merge(objeto);
			getEntityManager().remove(objeto);
		} catch (Exception e) {
			System.out.println("\nData da exceção: " + new Date());
			log.error("\nDao:\terro excluindo \n\t"+e.getMessage());
			System.out.println("\nDao:\terro excluindo \n\t"+e.getMessage());
		}
	}

	public T get(Long id) {
		if (id != null) {
			T t;
			try {
				t = getEntityManager().find(classe, id); 
			} catch (NoResultException e) {
				System.out.println("\nData da exceção: " + new Date());
				log.error(e.getMessage());
				t = null;
			}
			return t;
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public T get(String strQuery) {
		try {
			Query query = getEntityManager().createQuery(strQuery);
			return (T)query.getSingleResult();
		} catch (Exception e) {
			System.out.println("\nData da exceção: " + new Date());
			log.error("\nDao:\terro pesquisarParam\n\t" + e.getMessage());
			return null;
		}
	}

	public T get(Map<String, Object> params, String namedQuery) {
		T result;
		TypedQuery<T> query = getEntityManager().createNamedQuery(namedQuery, classe);	
		
		for(String key:params.keySet()) {
        	query.setParameter(key, params.get(key));
        }

		try {
			result = query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println("\nData da exceção: " + new Date());
			log.error("\nDAO.pesquisarNamedQuery \n\t"+ e.getMessage());
			result = null;
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public T get(String strQuery, Map<String, Object> params) {
		try {
			Query query = getEntityManager().createQuery(strQuery);
			for (String chave : params.keySet()) {
				query.setParameter(chave, params.get(chave));
			}
			return (T) query.getSingleResult();
		} catch (Exception e) {
			System.out.println("\nData da exceção: " + new Date());
			System.out.println("\nDAO:\terro em pesquisarParam \n\terro:"+ e.getMessage());
			log.error("\nDAO:\terro em pesquisarParam \n\terro:"+ e.getMessage() );
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<T> list(String strQuery) {
		try {
			return getEntityManager()
						.createQuery(strQuery)
						.getResultList();		
		} catch (NoResultException e) {
			System.out.println("\nData da exceção: " + new Date());
			log.error("\nDAO:\terro em listaTodos: "+e.getMessage());
			return null;
		}
	}

	/**
	 * Listar com String queries
	 * @param params
	 * @param namedQuery
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> list(String strQuery, Map<String, Object> params) {
		try {
            Query query = getEntityManager().createQuery(strQuery);
            for(String chave:params.keySet()) {
            	query.setParameter(chave, params.get(chave));
            }
            return (List<T>)query.getResultList();
        } catch (Exception e) {
        	System.out.println("\nData da exceção: " + new Date());
        	log.error("\nDAO:\terro em listaTodos(Map): "+e.getMessage());
    		return null;
        }
	}
	
	/**
	 * Listar com String queries
	 * @param params
	 * @param namedQuery
	 * @param numLinhas - nï¿½mero mï¿½ximos de registros de resultado
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> list(String strQuery, Map<String, Object> params, int numLinhas) {
		try {
            Query query = getEntityManager().createQuery(strQuery);
            for(String chave:params.keySet()) {
            	query.setParameter(chave, params.get(chave));
            }
            return (List<T>)query.setMaxResults(numLinhas).getResultList();
        } catch (Exception e) {
        	System.out.println("\nData da exceção: " + new Date());
        	log.error("\nDAO:\terro em listaTodos(Map): "+e.getMessage());
    		return null;
        }
	}

	/**
	 * Listar com NamedQueries
	 * @param params
	 * @param namedQuery
	 * @return
	 */
	public List<T> list(Map<String, Object> params, String namedQuery) {
		TypedQuery<T> query = getEntityManager().createNamedQuery(namedQuery, classe);
		
		for(String key:params.keySet()) {
        	query.setParameter(key, params.get(key));
        }
		
		try {
			return query.getResultList();
		} catch (NoResultException e) {
			System.out.println("\nData da exceção: " + new Date());
			return null;
		}
	}
	
	/**
	 * Listar com NamedQueries e com um nï¿½mero de registros mï¿½ximos de resposta
	 * @param params
	 * @param namedQuery
	 * @param numLinhas
	 * @return
	 */
	public List<T> list(Map<String, Object> params, String namedQuery, int numLinhas) {
		List<T> lista;
		TypedQuery<T> query = getEntityManager().createNamedQuery(namedQuery, classe);
		
		for(String key:params.keySet()) {
        	query.setParameter(key, params.get(key));
        }
		
		try {
			lista = query.setMaxResults(numLinhas).getResultList();
		} catch (NoResultException e) {
			System.out.println("\nData da exceção: " + new Date());
			lista = null;
		}
		
		return lista;		
	}
	
	@SuppressWarnings("unchecked")
	public List<T> list() {
		try {
			String strQuery = " FROM " + this.classe.getSimpleName();
			Query query = getEntityManager().createQuery(strQuery);
			return (List<T>)query.getResultList();
		} catch (Exception e) {
			System.out.println("\nData da exceção: " + new Date());
        	log.error("\nDAO:\terro em listaTodos: "+e.getMessage());
    		return null;
		}
	}

}