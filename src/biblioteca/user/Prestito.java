package biblioteca.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import biblioteca.ElementoBiblioteca;


@Entity
public class Prestito {
@OneToMany
	private User user;
@OneToOne
	private ElementoBiblioteca prestato;
	private LocalDate dataInizioPrestito;
	private boolean scaduto;
	private LocalDate dataRestituzione;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public ElementoBiblioteca getPrestato() {
		return prestato;
	}
	public void setPrestato(ElementoBiblioteca prestato) {
		this.prestato = prestato;
	}
	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}
	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
	}
	public boolean isScaduto() {
		return scaduto;
	}
	public void setScaduto(boolean scaduto) {
		this.scaduto = scaduto;
	}
	public LocalDate getDataRestituzione() {
		return dataRestituzione;
	}
	public void setDataRestituzione(LocalDate dataRestituzione) {
		this.dataRestituzione = dataRestituzione;
	}
	
	

}
