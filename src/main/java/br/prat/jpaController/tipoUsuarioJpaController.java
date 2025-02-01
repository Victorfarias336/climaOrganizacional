/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.prat.jpaController;

import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import br.prat.entitys.Usuario;
import br.prat.entitys.tipoUsuario;
import br.prat.jpaController.exceptions.NonexistentEntityException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class tipoUsuarioJpaController implements Serializable {

    public tipoUsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public tipoUsuarioJpaController(){
        emf = Persistence.createEntityManagerFactory("FeedbackPU");
    }

    public void create(tipoUsuario tipoUsuario) {
        if (tipoUsuario.getListaUsuarios() == null) {
            tipoUsuario.setListaUsuarios(new ArrayList<Usuario>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Usuario> attachedListaUsuarios = new ArrayList<Usuario>();
            for (Usuario listaUsuariosUsuarioToAttach : tipoUsuario.getListaUsuarios()) {
                listaUsuariosUsuarioToAttach = em.getReference(listaUsuariosUsuarioToAttach.getClass(), listaUsuariosUsuarioToAttach.getId());
                attachedListaUsuarios.add(listaUsuariosUsuarioToAttach);
            }
            tipoUsuario.setListaUsuarios(attachedListaUsuarios);
            em.persist(tipoUsuario);
            for (Usuario listaUsuariosUsuario : tipoUsuario.getListaUsuarios()) {
                tipoUsuario oldUmtipoOfListaUsuariosUsuario = listaUsuariosUsuario.getUmtipo();
                listaUsuariosUsuario.setUmtipo(tipoUsuario);
                listaUsuariosUsuario = em.merge(listaUsuariosUsuario);
                if (oldUmtipoOfListaUsuariosUsuario != null) {
                    oldUmtipoOfListaUsuariosUsuario.getListaUsuarios().remove(listaUsuariosUsuario);
                    oldUmtipoOfListaUsuariosUsuario = em.merge(oldUmtipoOfListaUsuariosUsuario);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(tipoUsuario tipoUsuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoUsuario persistenttipoUsuario = em.find(tipoUsuario.class, tipoUsuario.getId());
            List<Usuario> listaUsuariosOld = persistenttipoUsuario.getListaUsuarios();
            List<Usuario> listaUsuariosNew = tipoUsuario.getListaUsuarios();
            List<Usuario> attachedListaUsuariosNew = new ArrayList<Usuario>();
            for (Usuario listaUsuariosNewUsuarioToAttach : listaUsuariosNew) {
                listaUsuariosNewUsuarioToAttach = em.getReference(listaUsuariosNewUsuarioToAttach.getClass(), listaUsuariosNewUsuarioToAttach.getId());
                attachedListaUsuariosNew.add(listaUsuariosNewUsuarioToAttach);
            }
            listaUsuariosNew = attachedListaUsuariosNew;
            tipoUsuario.setListaUsuarios(listaUsuariosNew);
            tipoUsuario = em.merge(tipoUsuario);
            for (Usuario listaUsuariosOldUsuario : listaUsuariosOld) {
                if (!listaUsuariosNew.contains(listaUsuariosOldUsuario)) {
                    listaUsuariosOldUsuario.setUmtipo(null);
                    listaUsuariosOldUsuario = em.merge(listaUsuariosOldUsuario);
                }
            }
            for (Usuario listaUsuariosNewUsuario : listaUsuariosNew) {
                if (!listaUsuariosOld.contains(listaUsuariosNewUsuario)) {
                    tipoUsuario oldUmtipoOfListaUsuariosNewUsuario = listaUsuariosNewUsuario.getUmtipo();
                    listaUsuariosNewUsuario.setUmtipo(tipoUsuario);
                    listaUsuariosNewUsuario = em.merge(listaUsuariosNewUsuario);
                    if (oldUmtipoOfListaUsuariosNewUsuario != null && !oldUmtipoOfListaUsuariosNewUsuario.equals(tipoUsuario)) {
                        oldUmtipoOfListaUsuariosNewUsuario.getListaUsuarios().remove(listaUsuariosNewUsuario);
                        oldUmtipoOfListaUsuariosNewUsuario = em.merge(oldUmtipoOfListaUsuariosNewUsuario);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = tipoUsuario.getId();
                if (findtipoUsuario(id) == null) {
                    throw new NonexistentEntityException("The tipoUsuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            tipoUsuario tipoUsuario;
            try {
                tipoUsuario = em.getReference(tipoUsuario.class, id);
                tipoUsuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoUsuario with id " + id + " no longer exists.", enfe);
            }
            List<Usuario> listaUsuarios = tipoUsuario.getListaUsuarios();
            for (Usuario listaUsuariosUsuario : listaUsuarios) {
                listaUsuariosUsuario.setUmtipo(null);
                listaUsuariosUsuario = em.merge(listaUsuariosUsuario);
            }
            em.remove(tipoUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<tipoUsuario> findtipoUsuarioEntities() {
        return findtipoUsuarioEntities(true, -1, -1);
    }

    public List<tipoUsuario> findtipoUsuarioEntities(int maxResults, int firstResult) {
        return findtipoUsuarioEntities(false, maxResults, firstResult);
    }

    private List<tipoUsuario> findtipoUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(tipoUsuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public tipoUsuario findtipoUsuario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(tipoUsuario.class, id);
        } finally {
            em.close();
        }
    }

    public int gettipoUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<tipoUsuario> rt = cq.from(tipoUsuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
