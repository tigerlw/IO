package com.ucloudlink.redis;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 缓存服务接口
 * @author liuwei
 *
 * @param <T>
 */

public interface CacheDataDao
{
	
	public <T> T getDataByOneKey(String primKey,Class<T> entityClass);
	
	public <T> void setDataByOneKey(String primKey,T cacheData);
	
	/**
	 * 获取缓存数据
	 * @param primKey 缓存key
	 * @param dataKey 数据key
	 * @param entityClass 返回类型
	 * @return
	 */
	public <T> T getDataByKey(String primKey, String dataKey,Class<T> entityClass);
	
	/**
	 * 获取List缓存数据
	 * @param primKey
	 * @param dataKey
	 * @param entityClass
	 * @return
	 */
	public <T> List<T> getListDataByKey(String primKey, String dataKey,Class<T> entityClass);
	
	/**
	 * 批量获取缓存数据
	 * @param primKey 缓存key
	 * @param entityClass 返回类型
	 * @return
	 */
	public <T> List<T> batchGetData(String primKey,Class<T> entityClass);

	/**
	 * 保存数据到缓存
	 * @param primKey 缓存key
	 * @param dataKey 数据key
	 * @param cacheData 数据
	 */
	public <T> void setDataByKey(String primKey, String dataKey, T cacheData);
	
	/**
	 * 批量保存数据到缓存
	 * @param primKey
	 * @param cacheData
	 */
	public <K,T> void batchSetData(String primKey,Map<K,T> cacheData);
	
	
	/**
	 * 删除缓存数据
	 * @param primKey 缓存key
	 * @param dataKey 数据key
	 */
	public void deleteDataByKey(String primKey, String ...dataKey);
	
	
	public Map<String, String> getDataMap(String primaryKey);
	
	public String getStringValueByKey(String primKey, String dataKey);
	
	public Set<String> getMapKeysByPrimKey(String primKey);
	
	public void deleteKey(String primKey);
	
	/**
	 * 增加集合类缓存元素
	 * 
	 * @param primKey
	 * @param value
	 * @param score   排序用的分数
	 */
	public void zAddValueByKey(String primKey, String value, double score);
	
	/**
	 * 增加集合类缓存元素
	 * 
	 * @param primKey
	 * @param valueMap
	 */
	public void zAddValueByMap(String primKey, Map<String, Double> valueMap);
	
	/**
	 * 删除集合类缓存元素
	 * 
	 * @param primKey
	 * @param key
	 */
	public void zRemoveValueByKey(String primKey, String keys);
	
	/**
	 * 删除集合类缓存元素
	 * 
	 * @param primKey
	 * @param keys
	 */
	public void zRemoveValueByKeys(String primKey, String[] keys);
	
	/**
	 * 获取集合长度
	 * 
	 * @param primKey
	 * @return 集合长度
	 */
	public long zCard(String primKey);
	
	/**
	 * 按score倒序排列获取集合元素列表
	 * 
	 * @param key 集合名称
	 * @param max 最大值
	 * @param min 最小值
	 * @return 集合元素列表
	 */
	public Set<String> zRevRangeByScore(String key, double max, double min);
}
