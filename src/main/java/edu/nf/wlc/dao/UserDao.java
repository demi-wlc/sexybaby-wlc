package edu.nf.wlc.dao;

import edu.nf.wlc.entity.Users;

import java.util.List;

public interface UserDao {
    void add(Users users);
    List<Users> list();
}
