package my.study.mybatis.mapper;

import my.study.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {
    //@Select("SELECT * FROM user WHERE id = #{id}")
    User selectUser(@Param("id") Integer id);
}
