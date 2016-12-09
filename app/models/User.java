package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.avaje.ebean.Model;

@Entity
public class User extends Model {

	@Id
	public Long id;

	@NotNull
	public String userName;

	@NotNull
	public String password;

	public static Finder<Long, User> find = new Finder<Long, User>(User.class);
}