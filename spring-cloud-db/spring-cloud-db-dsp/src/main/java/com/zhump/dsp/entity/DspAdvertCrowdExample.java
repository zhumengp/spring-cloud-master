package com.zhump.dsp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DspAdvertCrowdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DspAdvertCrowdExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andCrowdIdIsNull() {
            addCriterion("CROWD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrowdIdIsNotNull() {
            addCriterion("CROWD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrowdIdEqualTo(Long value) {
            addCriterion("CROWD_ID =", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdNotEqualTo(Long value) {
            addCriterion("CROWD_ID <>", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdGreaterThan(Long value) {
            addCriterion("CROWD_ID >", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CROWD_ID >=", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdLessThan(Long value) {
            addCriterion("CROWD_ID <", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdLessThanOrEqualTo(Long value) {
            addCriterion("CROWD_ID <=", value, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdIn(List<Long> values) {
            addCriterion("CROWD_ID in", values, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdNotIn(List<Long> values) {
            addCriterion("CROWD_ID not in", values, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdBetween(Long value1, Long value2) {
            addCriterion("CROWD_ID between", value1, value2, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCrowdIdNotBetween(Long value1, Long value2) {
            addCriterion("CROWD_ID not between", value1, value2, "crowdId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeIsNull() {
            addCriterion("ADVERT_CROWD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeIsNotNull() {
            addCriterion("ADVERT_CROWD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeEqualTo(Integer value) {
            addCriterion("ADVERT_CROWD_TYPE =", value, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeNotEqualTo(Integer value) {
            addCriterion("ADVERT_CROWD_TYPE <>", value, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeGreaterThan(Integer value) {
            addCriterion("ADVERT_CROWD_TYPE >", value, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADVERT_CROWD_TYPE >=", value, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeLessThan(Integer value) {
            addCriterion("ADVERT_CROWD_TYPE <", value, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ADVERT_CROWD_TYPE <=", value, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeIn(List<Integer> values) {
            addCriterion("ADVERT_CROWD_TYPE in", values, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeNotIn(List<Integer> values) {
            addCriterion("ADVERT_CROWD_TYPE not in", values, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeBetween(Integer value1, Integer value2) {
            addCriterion("ADVERT_CROWD_TYPE between", value1, value2, "advertCrowdType");
            return (Criteria) this;
        }

        public Criteria andAdvertCrowdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ADVERT_CROWD_TYPE not between", value1, value2, "advertCrowdType");
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

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
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