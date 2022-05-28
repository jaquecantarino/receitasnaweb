package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity /* indica que é uma tabela no nosso bco de dados */
@Table(name="tb_usuarioLeitor") /* Essa anotação serve para indicar o nome da nova tabela */
public class usuarioLeitorModel {
	
	@Id /* indica que é a identificação desse objeto na tabela */
	@GeneratedValue (strategy = GenerationType.IDENTITY) /* gera o id automaticamente ao criar um novo objeto */
	private long id;
	
	@NotBlank /* anotação que valida se o campo está vazio, torna o campo obrigatório */
	@Size(min=3,max=11) /* anotação limita o tamanho da string, com min e max de caracteres */
	private String nome;
	
	@NotBlank
	@Size(min=2,max=20)
	private String sobrenome;
	
	@NotBlank
	@Email
	@Size(min=6,max=70)
	private String email;
	
	@NotBlank
	@Size(min=8)
	private String senha;
	
	private String foto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	

}
