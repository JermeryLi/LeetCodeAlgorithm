package com.lining.question_seventeen;

import java.util.List;

/**
 * @author lining
 * @date 2021/4/8 8:58
 * 1773. 统计匹配检索规则的物品数量
 * https://leetcode-cn.com/problems/count-items-matching-a-rule/
 * 给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 */
public class CountMatches {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int flag;
        if ("type".equals(ruleKey)) {
            flag = 0;
        } else if ("color".equals(ruleKey)) {
            flag = 1;
        } else {
            flag = 2;
        }
        int count = 0;
        for (List<String> item : items) {
            String s = item.get(flag);
            if (ruleValue.equals(s)) {
                count++;
            }
        }
        return count;
    }

}
