package mybatis.mapper;

public interface FeeBaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FeeBase record);

    int insertSelective(FeeBase record);

    FeeBase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FeeBase record);

    int updateByPrimaryKey(FeeBase record);
}