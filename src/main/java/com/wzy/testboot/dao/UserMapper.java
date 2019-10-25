package com.wzy.testboot.dao;




import com.wzy.testboot.domain.User;
        import org.apache.ibatis.annotations.Mapper;
        import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> selectUserByName();
}