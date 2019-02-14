package mooc;

import java.util.*;

public class Platform {

	public Platform() {
	}

	/**
	 * Ajoute un cours à la liste de cours dispensés
	 * @param c le cours à ajouter (non null)
	 */
	public void addCourse(Course c) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return les étudiants inscrits à l'université
	 */
	public Set<Person> students() {
          
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return les cours dispensés par l'université
	 */
	public Set<Course> courses() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Inscrire un étudiant à l'université
	 * @param s  l'étudiant à inscrire (non null)
	 */
	public void registerStudent(Person s) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Inscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws PlatformException si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 */
	public void enroll(Person s, Course c) throws PlatformException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Désinscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws PlatformException si l'étudiant a déjà une note àce cours
	 */
	public void withdraw(Person s, Course c) throws PlatformException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Donner une note à un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @param  mark la note
	 * @throws PlatformException si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université,
	 * ou si l'étudiant a déjà une note pour ce cours
	 */
	public void setMark(Person s, Course c, int mark) throws PlatformException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * Connaitre la note d'un étudiant pour un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @return la note de l'étudiant pour le cours
	 * @throws PlatformException si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 * ou si l'étudiant n'a pas encore de note à ce cours
	 */
	public int getMark(Person s, Course c) throws PlatformException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c le cours considéré
	 * @return les étudiants inscrits à ce cours
	 * @throws PlatformException si le cours n'est pas dispensé par l'université
	 */
	public Set<Person> studentsForCourse(Course c) throws PlatformException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param s l'étudiant considéré
	 * @return les cours auxquels un étudiant est incrit
	 * @throws PlatformException si l'étudiant n'est pas inscrit à l'université, 
	 */
	public Set<Course> coursesForStudent(Person s) throws PlatformException {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return les cours auxquels aucun étudiant n'est incrit
	 */
	public Set<Course> emptyCourses() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
