package org.com.zhump.dsp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DspAdvertTaskAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DspAdvertTaskAuditExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNull() {
            addCriterion("AD_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("AD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(String value) {
            addCriterion("AD_ID =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(String value) {
            addCriterion("AD_ID <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(String value) {
            addCriterion("AD_ID >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("AD_ID >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(String value) {
            addCriterion("AD_ID <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(String value) {
            addCriterion("AD_ID <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLike(String value) {
            addCriterion("AD_ID like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotLike(String value) {
            addCriterion("AD_ID not like", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<String> values) {
            addCriterion("AD_ID in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<String> values) {
            addCriterion("AD_ID not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(String value1, String value2) {
            addCriterion("AD_ID between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(String value1, String value2) {
            addCriterion("AD_ID not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNull() {
            addCriterion("CORP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIsNotNull() {
            addCriterion("CORP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCorpCodeEqualTo(String value) {
            addCriterion("CORP_CODE =", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotEqualTo(String value) {
            addCriterion("CORP_CODE <>", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThan(String value) {
            addCriterion("CORP_CODE >", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_CODE >=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThan(String value) {
            addCriterion("CORP_CODE <", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLessThanOrEqualTo(String value) {
            addCriterion("CORP_CODE <=", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeLike(String value) {
            addCriterion("CORP_CODE like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotLike(String value) {
            addCriterion("CORP_CODE not like", value, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeIn(List<String> values) {
            addCriterion("CORP_CODE in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotIn(List<String> values) {
            addCriterion("CORP_CODE not in", values, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeBetween(String value1, String value2) {
            addCriterion("CORP_CODE between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andCorpCodeNotBetween(String value1, String value2) {
            addCriterion("CORP_CODE not between", value1, value2, "corpCode");
            return (Criteria) this;
        }

        public Criteria andAdThemeIsNull() {
            addCriterion("AD_THEME is null");
            return (Criteria) this;
        }

        public Criteria andAdThemeIsNotNull() {
            addCriterion("AD_THEME is not null");
            return (Criteria) this;
        }

        public Criteria andAdThemeEqualTo(String value) {
            addCriterion("AD_THEME =", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeNotEqualTo(String value) {
            addCriterion("AD_THEME <>", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeGreaterThan(String value) {
            addCriterion("AD_THEME >", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeGreaterThanOrEqualTo(String value) {
            addCriterion("AD_THEME >=", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeLessThan(String value) {
            addCriterion("AD_THEME <", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeLessThanOrEqualTo(String value) {
            addCriterion("AD_THEME <=", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeLike(String value) {
            addCriterion("AD_THEME like", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeNotLike(String value) {
            addCriterion("AD_THEME not like", value, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeIn(List<String> values) {
            addCriterion("AD_THEME in", values, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeNotIn(List<String> values) {
            addCriterion("AD_THEME not in", values, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeBetween(String value1, String value2) {
            addCriterion("AD_THEME between", value1, value2, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdThemeNotBetween(String value1, String value2) {
            addCriterion("AD_THEME not between", value1, value2, "adTheme");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNull() {
            addCriterion("AD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAdTypeIsNotNull() {
            addCriterion("AD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAdTypeEqualTo(Integer value) {
            addCriterion("AD_TYPE =", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotEqualTo(Integer value) {
            addCriterion("AD_TYPE <>", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThan(Integer value) {
            addCriterion("AD_TYPE >", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_TYPE >=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThan(Integer value) {
            addCriterion("AD_TYPE <", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("AD_TYPE <=", value, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeIn(List<Integer> values) {
            addCriterion("AD_TYPE in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotIn(List<Integer> values) {
            addCriterion("AD_TYPE not in", values, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeBetween(Integer value1, Integer value2) {
            addCriterion("AD_TYPE between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andAdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_TYPE not between", value1, value2, "adType");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNull() {
            addCriterion("TOTAL_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalCountIsNotNull() {
            addCriterion("TOTAL_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCountEqualTo(Long value) {
            addCriterion("TOTAL_COUNT =", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotEqualTo(Long value) {
            addCriterion("TOTAL_COUNT <>", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThan(Long value) {
            addCriterion("TOTAL_COUNT >", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_COUNT >=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThan(Long value) {
            addCriterion("TOTAL_COUNT <", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_COUNT <=", value, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountIn(List<Long> values) {
            addCriterion("TOTAL_COUNT in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotIn(List<Long> values) {
            addCriterion("TOTAL_COUNT not in", values, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountBetween(Long value1, Long value2) {
            addCriterion("TOTAL_COUNT between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andTotalCountNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_COUNT not between", value1, value2, "totalCount");
            return (Criteria) this;
        }

        public Criteria andDailyLimitIsNull() {
            addCriterion("DAILY_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andDailyLimitIsNotNull() {
            addCriterion("DAILY_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDailyLimitEqualTo(Long value) {
            addCriterion("DAILY_LIMIT =", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitNotEqualTo(Long value) {
            addCriterion("DAILY_LIMIT <>", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitGreaterThan(Long value) {
            addCriterion("DAILY_LIMIT >", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitGreaterThanOrEqualTo(Long value) {
            addCriterion("DAILY_LIMIT >=", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitLessThan(Long value) {
            addCriterion("DAILY_LIMIT <", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitLessThanOrEqualTo(Long value) {
            addCriterion("DAILY_LIMIT <=", value, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitIn(List<Long> values) {
            addCriterion("DAILY_LIMIT in", values, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitNotIn(List<Long> values) {
            addCriterion("DAILY_LIMIT not in", values, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitBetween(Long value1, Long value2) {
            addCriterion("DAILY_LIMIT between", value1, value2, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andDailyLimitNotBetween(Long value1, Long value2) {
            addCriterion("DAILY_LIMIT not between", value1, value2, "dailyLimit");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNull() {
            addCriterion("EFFECT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEffectDateIsNotNull() {
            addCriterion("EFFECT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectDateEqualTo(Integer value) {
            addCriterion("EFFECT_DATE =", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotEqualTo(Integer value) {
            addCriterion("EFFECT_DATE <>", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThan(Integer value) {
            addCriterion("EFFECT_DATE >", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("EFFECT_DATE >=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThan(Integer value) {
            addCriterion("EFFECT_DATE <", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateLessThanOrEqualTo(Integer value) {
            addCriterion("EFFECT_DATE <=", value, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateIn(List<Integer> values) {
            addCriterion("EFFECT_DATE in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotIn(List<Integer> values) {
            addCriterion("EFFECT_DATE not in", values, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateBetween(Integer value1, Integer value2) {
            addCriterion("EFFECT_DATE between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andEffectDateNotBetween(Integer value1, Integer value2) {
            addCriterion("EFFECT_DATE not between", value1, value2, "effectDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNull() {
            addCriterion("EXPIRY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIsNotNull() {
            addCriterion("EXPIRY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpiryDateEqualTo(Integer value) {
            addCriterion("EXPIRY_DATE =", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotEqualTo(Integer value) {
            addCriterion("EXPIRY_DATE <>", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThan(Integer value) {
            addCriterion("EXPIRY_DATE >", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXPIRY_DATE >=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThan(Integer value) {
            addCriterion("EXPIRY_DATE <", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateLessThanOrEqualTo(Integer value) {
            addCriterion("EXPIRY_DATE <=", value, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateIn(List<Integer> values) {
            addCriterion("EXPIRY_DATE in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotIn(List<Integer> values) {
            addCriterion("EXPIRY_DATE not in", values, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRY_DATE between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andExpiryDateNotBetween(Integer value1, Integer value2) {
            addCriterion("EXPIRY_DATE not between", value1, value2, "expiryDate");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("SEND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("SEND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(Integer value) {
            addCriterion("SEND_TYPE =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(Integer value) {
            addCriterion("SEND_TYPE <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(Integer value) {
            addCriterion("SEND_TYPE >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEND_TYPE >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(Integer value) {
            addCriterion("SEND_TYPE <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SEND_TYPE <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<Integer> values) {
            addCriterion("SEND_TYPE in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<Integer> values) {
            addCriterion("SEND_TYPE not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(Integer value1, Integer value2) {
            addCriterion("SEND_TYPE between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SEND_TYPE not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andContentLengthIsNull() {
            addCriterion("CONTENT_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andContentLengthIsNotNull() {
            addCriterion("CONTENT_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andContentLengthEqualTo(String value) {
            addCriterion("CONTENT_LENGTH =", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotEqualTo(String value) {
            addCriterion("CONTENT_LENGTH <>", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthGreaterThan(String value) {
            addCriterion("CONTENT_LENGTH >", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthGreaterThanOrEqualTo(String value) {
            addCriterion("CONTENT_LENGTH >=", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthLessThan(String value) {
            addCriterion("CONTENT_LENGTH <", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthLessThanOrEqualTo(String value) {
            addCriterion("CONTENT_LENGTH <=", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthLike(String value) {
            addCriterion("CONTENT_LENGTH like", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotLike(String value) {
            addCriterion("CONTENT_LENGTH not like", value, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthIn(List<String> values) {
            addCriterion("CONTENT_LENGTH in", values, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotIn(List<String> values) {
            addCriterion("CONTENT_LENGTH not in", values, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthBetween(String value1, String value2) {
            addCriterion("CONTENT_LENGTH between", value1, value2, "contentLength");
            return (Criteria) this;
        }

        public Criteria andContentLengthNotBetween(String value1, String value2) {
            addCriterion("CONTENT_LENGTH not between", value1, value2, "contentLength");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeIsNull() {
            addCriterion("REAL_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeIsNotNull() {
            addCriterion("REAL_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeEqualTo(Date value) {
            addCriterion("REAL_END_TIME =", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeNotEqualTo(Date value) {
            addCriterion("REAL_END_TIME <>", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeGreaterThan(Date value) {
            addCriterion("REAL_END_TIME >", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REAL_END_TIME >=", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeLessThan(Date value) {
            addCriterion("REAL_END_TIME <", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("REAL_END_TIME <=", value, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeIn(List<Date> values) {
            addCriterion("REAL_END_TIME in", values, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeNotIn(List<Date> values) {
            addCriterion("REAL_END_TIME not in", values, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeBetween(Date value1, Date value2) {
            addCriterion("REAL_END_TIME between", value1, value2, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andRealEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("REAL_END_TIME not between", value1, value2, "realEndTime");
            return (Criteria) this;
        }

        public Criteria andAdStateIsNull() {
            addCriterion("AD_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAdStateIsNotNull() {
            addCriterion("AD_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAdStateEqualTo(Integer value) {
            addCriterion("AD_STATE =", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateNotEqualTo(Integer value) {
            addCriterion("AD_STATE <>", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateGreaterThan(Integer value) {
            addCriterion("AD_STATE >", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AD_STATE >=", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateLessThan(Integer value) {
            addCriterion("AD_STATE <", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateLessThanOrEqualTo(Integer value) {
            addCriterion("AD_STATE <=", value, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateIn(List<Integer> values) {
            addCriterion("AD_STATE in", values, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateNotIn(List<Integer> values) {
            addCriterion("AD_STATE not in", values, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateBetween(Integer value1, Integer value2) {
            addCriterion("AD_STATE between", value1, value2, "adState");
            return (Criteria) this;
        }

        public Criteria andAdStateNotBetween(Integer value1, Integer value2) {
            addCriterion("AD_STATE not between", value1, value2, "adState");
            return (Criteria) this;
        }

        public Criteria andRestCountIsNull() {
            addCriterion("REST_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andRestCountIsNotNull() {
            addCriterion("REST_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRestCountEqualTo(Long value) {
            addCriterion("REST_COUNT =", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountNotEqualTo(Long value) {
            addCriterion("REST_COUNT <>", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountGreaterThan(Long value) {
            addCriterion("REST_COUNT >", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountGreaterThanOrEqualTo(Long value) {
            addCriterion("REST_COUNT >=", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountLessThan(Long value) {
            addCriterion("REST_COUNT <", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountLessThanOrEqualTo(Long value) {
            addCriterion("REST_COUNT <=", value, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountIn(List<Long> values) {
            addCriterion("REST_COUNT in", values, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountNotIn(List<Long> values) {
            addCriterion("REST_COUNT not in", values, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountBetween(Long value1, Long value2) {
            addCriterion("REST_COUNT between", value1, value2, "restCount");
            return (Criteria) this;
        }

        public Criteria andRestCountNotBetween(Long value1, Long value2) {
            addCriterion("REST_COUNT not between", value1, value2, "restCount");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNull() {
            addCriterion("CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("CREAT_TIME =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("CREAT_TIME <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("CREAT_TIME >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREAT_TIME >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("CREAT_TIME <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREAT_TIME <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("CREAT_TIME in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("CREAT_TIME not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("CREAT_TIME between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREAT_TIME not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNull() {
            addCriterion("PUSH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPushTimeIsNotNull() {
            addCriterion("PUSH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPushTimeEqualTo(String value) {
            addCriterion("PUSH_TIME =", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotEqualTo(String value) {
            addCriterion("PUSH_TIME <>", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThan(String value) {
            addCriterion("PUSH_TIME >", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PUSH_TIME >=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThan(String value) {
            addCriterion("PUSH_TIME <", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLessThanOrEqualTo(String value) {
            addCriterion("PUSH_TIME <=", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeLike(String value) {
            addCriterion("PUSH_TIME like", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotLike(String value) {
            addCriterion("PUSH_TIME not like", value, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeIn(List<String> values) {
            addCriterion("PUSH_TIME in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotIn(List<String> values) {
            addCriterion("PUSH_TIME not in", values, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeBetween(String value1, String value2) {
            addCriterion("PUSH_TIME between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andPushTimeNotBetween(String value1, String value2) {
            addCriterion("PUSH_TIME not between", value1, value2, "pushTime");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("AUDIT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("AUDIT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(Integer value) {
            addCriterion("AUDIT_STATE =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(Integer value) {
            addCriterion("AUDIT_STATE <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(Integer value) {
            addCriterion("AUDIT_STATE >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_STATE >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(Integer value) {
            addCriterion("AUDIT_STATE <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_STATE <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<Integer> values) {
            addCriterion("AUDIT_STATE in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<Integer> values) {
            addCriterion("AUDIT_STATE not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_STATE between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_STATE not between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(String value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(String value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(String value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(String value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(String value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLike(String value) {
            addCriterion("TEMPLATE_ID like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotLike(String value) {
            addCriterion("TEMPLATE_ID not like", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<String> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<String> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(String value1, String value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andIspAllowIsNull() {
            addCriterion("ISP_ALLOW is null");
            return (Criteria) this;
        }

        public Criteria andIspAllowIsNotNull() {
            addCriterion("ISP_ALLOW is not null");
            return (Criteria) this;
        }

        public Criteria andIspAllowEqualTo(String value) {
            addCriterion("ISP_ALLOW =", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowNotEqualTo(String value) {
            addCriterion("ISP_ALLOW <>", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowGreaterThan(String value) {
            addCriterion("ISP_ALLOW >", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowGreaterThanOrEqualTo(String value) {
            addCriterion("ISP_ALLOW >=", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowLessThan(String value) {
            addCriterion("ISP_ALLOW <", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowLessThanOrEqualTo(String value) {
            addCriterion("ISP_ALLOW <=", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowLike(String value) {
            addCriterion("ISP_ALLOW like", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowNotLike(String value) {
            addCriterion("ISP_ALLOW not like", value, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowIn(List<String> values) {
            addCriterion("ISP_ALLOW in", values, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowNotIn(List<String> values) {
            addCriterion("ISP_ALLOW not in", values, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowBetween(String value1, String value2) {
            addCriterion("ISP_ALLOW between", value1, value2, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andIspAllowNotBetween(String value1, String value2) {
            addCriterion("ISP_ALLOW not between", value1, value2, "ispAllow");
            return (Criteria) this;
        }

        public Criteria andCanRepeatIsNull() {
            addCriterion("CAN_REPEAT is null");
            return (Criteria) this;
        }

        public Criteria andCanRepeatIsNotNull() {
            addCriterion("CAN_REPEAT is not null");
            return (Criteria) this;
        }

        public Criteria andCanRepeatEqualTo(Byte value) {
            addCriterion("CAN_REPEAT =", value, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatNotEqualTo(Byte value) {
            addCriterion("CAN_REPEAT <>", value, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatGreaterThan(Byte value) {
            addCriterion("CAN_REPEAT >", value, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatGreaterThanOrEqualTo(Byte value) {
            addCriterion("CAN_REPEAT >=", value, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatLessThan(Byte value) {
            addCriterion("CAN_REPEAT <", value, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatLessThanOrEqualTo(Byte value) {
            addCriterion("CAN_REPEAT <=", value, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatIn(List<Byte> values) {
            addCriterion("CAN_REPEAT in", values, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatNotIn(List<Byte> values) {
            addCriterion("CAN_REPEAT not in", values, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatBetween(Byte value1, Byte value2) {
            addCriterion("CAN_REPEAT between", value1, value2, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCanRepeatNotBetween(Byte value1, Byte value2) {
            addCriterion("CAN_REPEAT not between", value1, value2, "canRepeat");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("CHECK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("CHECK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("CHECK_TIME =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("CHECK_TIME <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("CHECK_TIME >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("CHECK_TIME <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_TIME <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("CHECK_TIME in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("CHECK_TIME not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_TIME not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNull() {
            addCriterion("CHECK_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNotNull() {
            addCriterion("CHECK_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkEqualTo(String value) {
            addCriterion("CHECK_REMARK =", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotEqualTo(String value) {
            addCriterion("CHECK_REMARK <>", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThan(String value) {
            addCriterion("CHECK_REMARK >", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_REMARK >=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThan(String value) {
            addCriterion("CHECK_REMARK <", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
            addCriterion("CHECK_REMARK <=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLike(String value) {
            addCriterion("CHECK_REMARK like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotLike(String value) {
            addCriterion("CHECK_REMARK not like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIn(List<String> values) {
            addCriterion("CHECK_REMARK in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotIn(List<String> values) {
            addCriterion("CHECK_REMARK not in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkBetween(String value1, String value2) {
            addCriterion("CHECK_REMARK between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotBetween(String value1, String value2) {
            addCriterion("CHECK_REMARK not between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNull() {
            addCriterion("KEY_WORD is null");
            return (Criteria) this;
        }

        public Criteria andKeyWordIsNotNull() {
            addCriterion("KEY_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeyWordEqualTo(String value) {
            addCriterion("KEY_WORD =", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotEqualTo(String value) {
            addCriterion("KEY_WORD <>", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThan(String value) {
            addCriterion("KEY_WORD >", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_WORD >=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThan(String value) {
            addCriterion("KEY_WORD <", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLessThanOrEqualTo(String value) {
            addCriterion("KEY_WORD <=", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordLike(String value) {
            addCriterion("KEY_WORD like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotLike(String value) {
            addCriterion("KEY_WORD not like", value, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordIn(List<String> values) {
            addCriterion("KEY_WORD in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotIn(List<String> values) {
            addCriterion("KEY_WORD not in", values, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordBetween(String value1, String value2) {
            addCriterion("KEY_WORD between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andKeyWordNotBetween(String value1, String value2) {
            addCriterion("KEY_WORD not between", value1, value2, "keyWord");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRestRefundIsNull() {
            addCriterion("REST_REFUND is null");
            return (Criteria) this;
        }

        public Criteria andRestRefundIsNotNull() {
            addCriterion("REST_REFUND is not null");
            return (Criteria) this;
        }

        public Criteria andRestRefundEqualTo(Integer value) {
            addCriterion("REST_REFUND =", value, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundNotEqualTo(Integer value) {
            addCriterion("REST_REFUND <>", value, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundGreaterThan(Integer value) {
            addCriterion("REST_REFUND >", value, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundGreaterThanOrEqualTo(Integer value) {
            addCriterion("REST_REFUND >=", value, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundLessThan(Integer value) {
            addCriterion("REST_REFUND <", value, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundLessThanOrEqualTo(Integer value) {
            addCriterion("REST_REFUND <=", value, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundIn(List<Integer> values) {
            addCriterion("REST_REFUND in", values, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundNotIn(List<Integer> values) {
            addCriterion("REST_REFUND not in", values, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundBetween(Integer value1, Integer value2) {
            addCriterion("REST_REFUND between", value1, value2, "restRefund");
            return (Criteria) this;
        }

        public Criteria andRestRefundNotBetween(Integer value1, Integer value2) {
            addCriterion("REST_REFUND not between", value1, value2, "restRefund");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIsNull() {
            addCriterion("ASSIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIsNotNull() {
            addCriterion("ASSIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignTypeEqualTo(Integer value) {
            addCriterion("ASSIGN_TYPE =", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotEqualTo(Integer value) {
            addCriterion("ASSIGN_TYPE <>", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeGreaterThan(Integer value) {
            addCriterion("ASSIGN_TYPE >", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ASSIGN_TYPE >=", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLessThan(Integer value) {
            addCriterion("ASSIGN_TYPE <", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ASSIGN_TYPE <=", value, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeIn(List<Integer> values) {
            addCriterion("ASSIGN_TYPE in", values, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotIn(List<Integer> values) {
            addCriterion("ASSIGN_TYPE not in", values, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeBetween(Integer value1, Integer value2) {
            addCriterion("ASSIGN_TYPE between", value1, value2, "assignType");
            return (Criteria) this;
        }

        public Criteria andAssignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ASSIGN_TYPE not between", value1, value2, "assignType");
            return (Criteria) this;
        }

        public Criteria andReplyDescIsNull() {
            addCriterion("REPLY_DESC is null");
            return (Criteria) this;
        }

        public Criteria andReplyDescIsNotNull() {
            addCriterion("REPLY_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDescEqualTo(String value) {
            addCriterion("REPLY_DESC =", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotEqualTo(String value) {
            addCriterion("REPLY_DESC <>", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescGreaterThan(String value) {
            addCriterion("REPLY_DESC >", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_DESC >=", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescLessThan(String value) {
            addCriterion("REPLY_DESC <", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescLessThanOrEqualTo(String value) {
            addCriterion("REPLY_DESC <=", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescLike(String value) {
            addCriterion("REPLY_DESC like", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotLike(String value) {
            addCriterion("REPLY_DESC not like", value, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescIn(List<String> values) {
            addCriterion("REPLY_DESC in", values, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotIn(List<String> values) {
            addCriterion("REPLY_DESC not in", values, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescBetween(String value1, String value2) {
            addCriterion("REPLY_DESC between", value1, value2, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andReplyDescNotBetween(String value1, String value2) {
            addCriterion("REPLY_DESC not between", value1, value2, "replyDesc");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdIsNull() {
            addCriterion("copy_ad_id is null");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdIsNotNull() {
            addCriterion("copy_ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdEqualTo(String value) {
            addCriterion("copy_ad_id =", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdNotEqualTo(String value) {
            addCriterion("copy_ad_id <>", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdGreaterThan(String value) {
            addCriterion("copy_ad_id >", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdGreaterThanOrEqualTo(String value) {
            addCriterion("copy_ad_id >=", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdLessThan(String value) {
            addCriterion("copy_ad_id <", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdLessThanOrEqualTo(String value) {
            addCriterion("copy_ad_id <=", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdLike(String value) {
            addCriterion("copy_ad_id like", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdNotLike(String value) {
            addCriterion("copy_ad_id not like", value, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdIn(List<String> values) {
            addCriterion("copy_ad_id in", values, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdNotIn(List<String> values) {
            addCriterion("copy_ad_id not in", values, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdBetween(String value1, String value2) {
            addCriterion("copy_ad_id between", value1, value2, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andCopyAdIdNotBetween(String value1, String value2) {
            addCriterion("copy_ad_id not between", value1, value2, "copyAdId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Integer value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Integer value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Integer value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Integer value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Integer> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Integer> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andQualityIdsIsNull() {
            addCriterion("QUALITY_IDS is null");
            return (Criteria) this;
        }

        public Criteria andQualityIdsIsNotNull() {
            addCriterion("QUALITY_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andQualityIdsEqualTo(String value) {
            addCriterion("QUALITY_IDS =", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsNotEqualTo(String value) {
            addCriterion("QUALITY_IDS <>", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsGreaterThan(String value) {
            addCriterion("QUALITY_IDS >", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITY_IDS >=", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsLessThan(String value) {
            addCriterion("QUALITY_IDS <", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsLessThanOrEqualTo(String value) {
            addCriterion("QUALITY_IDS <=", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsLike(String value) {
            addCriterion("QUALITY_IDS like", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsNotLike(String value) {
            addCriterion("QUALITY_IDS not like", value, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsIn(List<String> values) {
            addCriterion("QUALITY_IDS in", values, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsNotIn(List<String> values) {
            addCriterion("QUALITY_IDS not in", values, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsBetween(String value1, String value2) {
            addCriterion("QUALITY_IDS between", value1, value2, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andQualityIdsNotBetween(String value1, String value2) {
            addCriterion("QUALITY_IDS not between", value1, value2, "qualityIds");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("MARKET is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("MARKET is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(Integer value) {
            addCriterion("MARKET =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(Integer value) {
            addCriterion("MARKET <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(Integer value) {
            addCriterion("MARKET >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(Integer value) {
            addCriterion("MARKET >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(Integer value) {
            addCriterion("MARKET <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(Integer value) {
            addCriterion("MARKET <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<Integer> values) {
            addCriterion("MARKET in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<Integer> values) {
            addCriterion("MARKET not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(Integer value1, Integer value2) {
            addCriterion("MARKET between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(Integer value1, Integer value2) {
            addCriterion("MARKET not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeIsNull() {
            addCriterion("IS_OPTIMIZE is null");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeIsNotNull() {
            addCriterion("IS_OPTIMIZE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeEqualTo(Integer value) {
            addCriterion("IS_OPTIMIZE =", value, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeNotEqualTo(Integer value) {
            addCriterion("IS_OPTIMIZE <>", value, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeGreaterThan(Integer value) {
            addCriterion("IS_OPTIMIZE >", value, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_OPTIMIZE >=", value, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeLessThan(Integer value) {
            addCriterion("IS_OPTIMIZE <", value, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeLessThanOrEqualTo(Integer value) {
            addCriterion("IS_OPTIMIZE <=", value, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeIn(List<Integer> values) {
            addCriterion("IS_OPTIMIZE in", values, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeNotIn(List<Integer> values) {
            addCriterion("IS_OPTIMIZE not in", values, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeBetween(Integer value1, Integer value2) {
            addCriterion("IS_OPTIMIZE between", value1, value2, "isOptimize");
            return (Criteria) this;
        }

        public Criteria andIsOptimizeNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_OPTIMIZE not between", value1, value2, "isOptimize");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}