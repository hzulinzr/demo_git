package Mapper;

import entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userName",  column = "user_name", javaType = User.class),
            @Result(property = "nickPassword", column = "User_password")
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = User.class),
            @Result(property = "nickName", column = "nick_name")
    })
    User getOne(Long id);
}
