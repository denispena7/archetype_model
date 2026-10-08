#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "alumnos")
public class Alumno 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "apellidos", nullable = false, length = 150)
	private String apellidos;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private LocalDate fechaNacimiento;
	
	public Alumno() {}

	public Alumno(String nombre, String apellidos, LocalDate fechaNacimiento) 
	{
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// Getters y Setters
	public Long getId() {return id;}
	
	public void setId(Long id) { this.id = id;}
	
	public String getNombre() {return nombre;}
	
	public void setNombre(String nombre) {this.nombre = nombre;}
	
	public String getApellidos() {return apellidos;}
	
	public void setApellidos(String apellidos) {this.apellidos = apellidos;}
	
	public LocalDate getFechaNacimiento() {return fechaNacimiento;}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
}
