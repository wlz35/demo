package org.taru.dao.four;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PraiseDao {
     int praisedao(int homeid);
}
