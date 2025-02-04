/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.prat.jpaController;

import br.prat.entitys.Feedback;
import br.prat.jpaController.exceptions.NonexistentEntityException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;


public class FeedbackJpaController implements Serializable {

    public FeedbackJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public FeedbackJpaController(){
        emf = Persistence.createEntityManagerFactory("FeedbackPU");
    }
    public void create(Feedback feedback) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(feedback);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Feedback feedback) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            feedback = em.merge(feedback);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = feedback.getId();
                if (findFeedback(id) == null) {
                    throw new NonexistentEntityException("The feedback with id " + id + " no longer exists.");
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
            Feedback feedback;
            try {
                feedback = em.getReference(Feedback.class, id);
                feedback.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The feedback with id " + id + " no longer exists.", enfe);
            }
            em.remove(feedback);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Feedback> findFeedbackEntities() {
        return findFeedbackEntities(true, -1, -1);
    }

    public List<Feedback> findFeedbackEntities(int maxResults, int firstResult) {
        return findFeedbackEntities(false, maxResults, firstResult);
    }

    private List<Feedback> findFeedbackEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Feedback.class));
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

    public Feedback findFeedback(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Feedback.class, id);
        } finally {
            em.close();
        }
    }

    public int getFeedbackCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Feedback> rt = cq.from(Feedback.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
