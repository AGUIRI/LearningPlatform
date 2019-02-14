package mooc;

import java.util.*;

public class Platform {
        Set<Course>courses=new HashSet<>();
        Set<Person>students=new HashSet<>();
        Set<Enrollment>enrollement=new HashSet<>();
	public Platform() {
	}

	/**
	 * Ajoute un cours à la liste de cours dispensés
	 * @param c le cours à ajouter (non null)
	 */
	public void addCourse(Course c) {
                if (c==null){
                    throw new UnsupportedOperationException("course is null");
                }
                else{
                    courses.add(c);
                }
            }

	/**
	 * @return les étudiants inscrits à l'université
	 */
	public Set<Person> students() {
            return students;	
	}

	/**
	 * @return les cours dispensés par l'université
	 */
	public Set<Course> courses() {
            return courses;
	}

	/**
	 * Inscrire un étudiant à l'université
	 * @param s  l'étudiant à inscrire (non null)
	 */
	public void registerStudent(Person s) {
            
                    if(s==null){
                        throw new UnsupportedOperationException("person is null");
                    }
                    else{
                        students.add(s);
                    }
            }
		

	/**
	 * Inscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws PlatformException si l'étudiant n'est pas inscrit à l'université, 
	 * ou si le cours n'est pas dispensé par l'université
	 */
	public void enroll(Person s, Course c) throws PlatformException {
                        if (students.contains(s)&& courses.contains(c)){
                            Enrollment enr=new Enrollment(s, c);
                                enrollement.add(enr);
                        }
                        else{
                            throw new NullPointerException("person is null");
                        }
	}

	/**
	 * Désinscrire un étudiant à un cours
	 * @param  s l'étudiant
	 * @param  c le cours
	 * @throws PlatformException si l'étudiant a déjà une note àce cours
	 */
	public void withdraw(Person s, Course c) throws PlatformException{
            for (Enrollment enr :enrollement){
                if (enr.getCourse()==c &&
                    enr.getPerson()== s && 
                    enr.studentHasMark()==false){
                    enrollement.remove(enr);
                }
            }
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
            for(Enrollment enr:enrollement){
                if (students.contains(s)&& 
                    courses.contains(c)&& 
                    enr.studentHasMark()==false){
                    enr.setMark(mark);
                }
            }
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
		for(Enrollment enr:enrollement){
                    if (students.contains(s)&& 
                        courses.contains(c)&& 
                        enr.studentHasMark()==false){
                        return enr.getMark();
                    }
                    else{
                            throw new NullPointerException("l'étudiant n'est pas inscrit à l'université");
                    }
                }
            return 0;
        }
	/**
	 * @param c le cours considéré
	 * @return les étudiants inscrits à ce cours
	 * @throws PlatformException si le cours n'est pas dispensé par l'université
	 */
	public Set<Person> studentsForCourse(Course c) throws PlatformException{
            Set<Person> studentsc=new HashSet<>();
                if (courses.contains(c)){
                    for (Enrollment enr:enrollement ){
                        if (enr.getCourse()==c){
                            studentsc.add(enr.getPerson());
                        }
                    }
                }
                return studentsc;
        }
    
	
	/**
	 * @param s l'étudiant considéré
	 * @return les cours auxquels un étudiant est incrit
	 * @throws PlatformException si l'étudiant n'est pas inscrit à l'université, 
	 */
	public Set<Course> coursesForStudent(Person s) throws PlatformException {
		Set<Course> coursest=new HashSet<>();
                if (students.contains(s)){
                    for (Enrollment enr:enrollement ){
                        if (enr.getPerson()==s){
                            coursest.add(enr.getCourse());
                        }
                    }
                }
                return coursest;
	}

	/**
	 * @return les cours auxquels aucun étudiant n'est incrit
	 */
	public Set<Course> emptyCourses() {
            throw new UnsupportedOperationException("Not supported yet.");
	}

}
