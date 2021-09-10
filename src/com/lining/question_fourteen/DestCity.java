package com.lining.question_fourteen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：
 * 1436. 旅行终点站
 * https://leetcode-cn.com/problems/destination-city/
 * 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 * 题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站。
 * 1 <= paths.length <= 100
 * paths[i].length == 2
 * 1 <= cityAi.length, cityBi.length <= 10
 * cityAi != cityBi
 * 所有字符串均由大小写英文字母和空格字符组成。
 *
 * @author lining
 * createTime 2021/9/10 13:52
 */
public class DestCity {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        String start = paths.get(0).get(1);
        for (int i = 1; i < paths.size(); i++) {
            String key = paths.get(i).get(0);
            String value = paths.get(i).get(1);
            map.put(key, value);
            if (start.equals(key)) {
                start = value;
            }
            while (map.get(start) != null) {
                start = map.get(start);
            }
        }
        return start;
    }
}
