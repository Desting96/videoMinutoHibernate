/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.proyecto.DAO;

import co.edu.uniminuto.arqSw.proyecto.hibernate.HibernateUtil;
import co.edu.uniminuto.arqSw.proyecto.hibernate.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author daesh
 */
public class UsuarioDAO {
    Session sesion = null;

    public UsuarioDAO() {
        this.sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public List<Usuario> buscarUsuario() {
        List<Usuario> user = new ArrayList<Usuario>();
        try {
            Transaction tx = sesion.beginTransaction();
            Query q = sesion.createQuery("from Usuario");
            user = (List<Usuario>) q.list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
