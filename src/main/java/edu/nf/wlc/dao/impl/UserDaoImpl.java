package edu.nf.wlc.dao.impl;

import edu.nf.wlc.dao.UserDao;
import edu.nf.wlc.entity.Users;
import edu.nf.wlc.util.MytatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<Users> list() {
        try (SqlSession sqlSession = MytatisUtils.getSqlSession(true)) {
           return sqlSession.getMapper(UserDao.class).list();
        } catch (RuntimeException e) {
            throw e;
        }

    }

    @Override
    public void add(Users users) {
        try (SqlSession sqlSession = MytatisUtils.getSqlSession(true)) {
            sqlSession.getMapper(UserDao.class).add(users);
        } catch (RuntimeException e) {
            throw e;
        }

    }
}
