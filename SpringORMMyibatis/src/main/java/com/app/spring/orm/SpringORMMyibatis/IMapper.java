package com.app.spring.orm.SpringORMMyibatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;

public interface IMapper {

	@Select("SELECT * FROM ASL_NEW_USERS")
	public List<User> selectAllUsers();
	
	@Select("SELECT * FROM ASL_NEW_USERS WHERE id_user = #{id_user}" )
	public User selectClienteByID(@Param("id_user") int id_user);
	
	@Insert("INSERT INTO User (id_user, nombre_user, rut_user, email_user, fecha_registro. flag_habilitado) VALUES(#{id_user}, #{nombre_user}, #{rut_user}, #{email_user}, #{fecha_registro}, #{flag_habilitado})")
	public int insertUser(User user);
	
}
