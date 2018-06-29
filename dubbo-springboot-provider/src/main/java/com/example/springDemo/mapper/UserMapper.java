package com.example.springDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;

import com.dubbo.demo.bean.user.User;

/**user mappper
 * @author bennet-xiao
 * @create_time 2018-06-19 21:53:25
 * @todo TODO
 * @class com.example.springDemo.mapper.UserMapper
 */
@Mapper
public interface UserMapper {
	@Select("select user_name userName,password, user_id userId, uuid,"
			+ " user_address userAddress,id,version,last_update_time lastUpdateTime,"
			+ "create_time createTime,is_valid isValid"
			+ " from t_user")
	List<User> findUsers();
	
	@SelectKey(before=true,resultType=Long.class,keyProperty="id",statement="select max(id)+1 as id from t_user")
	@Insert("insert into t_user(id,user_name,password,user_id,user_address) values(#{id},#{userName},#{password},#{userId},#{userAddress})")
	void insert(User user);
}
