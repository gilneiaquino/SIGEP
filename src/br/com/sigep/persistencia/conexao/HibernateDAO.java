package br.com.sigep.persistencia.conexao;


import org.hibernate.Session;


public class HibernateDAO {

		private static HibernateDAO hibernateDAO = null;	
		private Session session = null;
   
	    public static HibernateDAO getInstace(){
	    	if(hibernateDAO == null){
	    		hibernateDAO = new HibernateDAO();
	    	}	    	
	    	return hibernateDAO;	    	
	    }	
     
        public void saveOrUpdate( Object obj ) throws Exception  
        {       session =  HibernateUtil.getSession();
        		session.getTransaction().begin();
        	    session.saveOrUpdate(obj);
        	    session.getTransaction().commit();  
                HibernateUtil.getSession().close();  
                
        }

      
//        public void update( Object obj ) throws Exception  
//        {      
//        		HibernateUtil.getSession().update(obj);  
//        		HibernateUtil.getSession().flush();  
//                util.getTransacao().commit();  
//                HibernateUtil.getSession().close();  
//      
//        }  
//      
//        public void delete( Object obj ) throws Exception  
//        {               
//        		HibernateUtil.getSession().delete(obj);  
//        		HibernateUtil.getSession().flush();  
//                util.getTransacao().commit();  
//                HibernateUtil.getSession().close();        
//        }   
 

}
