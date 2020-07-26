package org.com.zhump.dsp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DspAdvertMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DspAdvertMaterialExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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

        public Criteria andInitNameIsNull() {
            addCriterion("INIT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInitNameIsNotNull() {
            addCriterion("INIT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInitNameEqualTo(String value) {
            addCriterion("INIT_NAME =", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameNotEqualTo(String value) {
            addCriterion("INIT_NAME <>", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameGreaterThan(String value) {
            addCriterion("INIT_NAME >", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameGreaterThanOrEqualTo(String value) {
            addCriterion("INIT_NAME >=", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameLessThan(String value) {
            addCriterion("INIT_NAME <", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameLessThanOrEqualTo(String value) {
            addCriterion("INIT_NAME <=", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameLike(String value) {
            addCriterion("INIT_NAME like", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameNotLike(String value) {
            addCriterion("INIT_NAME not like", value, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameIn(List<String> values) {
            addCriterion("INIT_NAME in", values, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameNotIn(List<String> values) {
            addCriterion("INIT_NAME not in", values, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameBetween(String value1, String value2) {
            addCriterion("INIT_NAME between", value1, value2, "initName");
            return (Criteria) this;
        }

        public Criteria andInitNameNotBetween(String value1, String value2) {
            addCriterion("INIT_NAME not between", value1, value2, "initName");
            return (Criteria) this;
        }

        public Criteria andNewNameIsNull() {
            addCriterion("NEW_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNewNameIsNotNull() {
            addCriterion("NEW_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNewNameEqualTo(String value) {
            addCriterion("NEW_NAME =", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotEqualTo(String value) {
            addCriterion("NEW_NAME <>", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameGreaterThan(String value) {
            addCriterion("NEW_NAME >", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_NAME >=", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameLessThan(String value) {
            addCriterion("NEW_NAME <", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameLessThanOrEqualTo(String value) {
            addCriterion("NEW_NAME <=", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameLike(String value) {
            addCriterion("NEW_NAME like", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotLike(String value) {
            addCriterion("NEW_NAME not like", value, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameIn(List<String> values) {
            addCriterion("NEW_NAME in", values, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotIn(List<String> values) {
            addCriterion("NEW_NAME not in", values, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameBetween(String value1, String value2) {
            addCriterion("NEW_NAME between", value1, value2, "newName");
            return (Criteria) this;
        }

        public Criteria andNewNameNotBetween(String value1, String value2) {
            addCriterion("NEW_NAME not between", value1, value2, "newName");
            return (Criteria) this;
        }

        public Criteria andFileFormatIsNull() {
            addCriterion("FILE_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andFileFormatIsNotNull() {
            addCriterion("FILE_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andFileFormatEqualTo(String value) {
            addCriterion("FILE_FORMAT =", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotEqualTo(String value) {
            addCriterion("FILE_FORMAT <>", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatGreaterThan(String value) {
            addCriterion("FILE_FORMAT >", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatGreaterThanOrEqualTo(String value) {
            addCriterion("FILE_FORMAT >=", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatLessThan(String value) {
            addCriterion("FILE_FORMAT <", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatLessThanOrEqualTo(String value) {
            addCriterion("FILE_FORMAT <=", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatLike(String value) {
            addCriterion("FILE_FORMAT like", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotLike(String value) {
            addCriterion("FILE_FORMAT not like", value, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatIn(List<String> values) {
            addCriterion("FILE_FORMAT in", values, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotIn(List<String> values) {
            addCriterion("FILE_FORMAT not in", values, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatBetween(String value1, String value2) {
            addCriterion("FILE_FORMAT between", value1, value2, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andFileFormatNotBetween(String value1, String value2) {
            addCriterion("FILE_FORMAT not between", value1, value2, "fileFormat");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("URL is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("URL is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("URL =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("URL <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("URL >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("URL >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("URL <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("URL <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("URL like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("URL not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("URL in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("URL not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("URL between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("URL not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("PATH is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("PATH =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("PATH <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("PATH >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("PATH >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("PATH <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("PATH <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("PATH like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("PATH not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("PATH in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("PATH not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("PATH between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("PATH not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("SIZE is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("SIZE =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("SIZE <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("SIZE >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("SIZE >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("SIZE <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("SIZE <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("SIZE in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("SIZE not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("SIZE between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("SIZE not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("DURATION is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Long value) {
            addCriterion("DURATION =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Long value) {
            addCriterion("DURATION <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Long value) {
            addCriterion("DURATION >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Long value) {
            addCriterion("DURATION <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Long value) {
            addCriterion("DURATION <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Long> values) {
            addCriterion("DURATION in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Long> values) {
            addCriterion("DURATION not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Long value1, Long value2) {
            addCriterion("DURATION between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Long value1, Long value2) {
            addCriterion("DURATION not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andCalssifyIsNull() {
            addCriterion("CALSSIFY is null");
            return (Criteria) this;
        }

        public Criteria andCalssifyIsNotNull() {
            addCriterion("CALSSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andCalssifyEqualTo(String value) {
            addCriterion("CALSSIFY =", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotEqualTo(String value) {
            addCriterion("CALSSIFY <>", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyGreaterThan(String value) {
            addCriterion("CALSSIFY >", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyGreaterThanOrEqualTo(String value) {
            addCriterion("CALSSIFY >=", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyLessThan(String value) {
            addCriterion("CALSSIFY <", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyLessThanOrEqualTo(String value) {
            addCriterion("CALSSIFY <=", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyLike(String value) {
            addCriterion("CALSSIFY like", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotLike(String value) {
            addCriterion("CALSSIFY not like", value, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyIn(List<String> values) {
            addCriterion("CALSSIFY in", values, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotIn(List<String> values) {
            addCriterion("CALSSIFY not in", values, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyBetween(String value1, String value2) {
            addCriterion("CALSSIFY between", value1, value2, "calssify");
            return (Criteria) this;
        }

        public Criteria andCalssifyNotBetween(String value1, String value2) {
            addCriterion("CALSSIFY not between", value1, value2, "calssify");
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

        public Criteria andMaterialSwitchIsNull() {
            addCriterion("MATERIAL_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchIsNotNull() {
            addCriterion("MATERIAL_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchEqualTo(Integer value) {
            addCriterion("MATERIAL_SWITCH =", value, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchNotEqualTo(Integer value) {
            addCriterion("MATERIAL_SWITCH <>", value, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchGreaterThan(Integer value) {
            addCriterion("MATERIAL_SWITCH >", value, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchGreaterThanOrEqualTo(Integer value) {
            addCriterion("MATERIAL_SWITCH >=", value, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchLessThan(Integer value) {
            addCriterion("MATERIAL_SWITCH <", value, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchLessThanOrEqualTo(Integer value) {
            addCriterion("MATERIAL_SWITCH <=", value, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchIn(List<Integer> values) {
            addCriterion("MATERIAL_SWITCH in", values, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchNotIn(List<Integer> values) {
            addCriterion("MATERIAL_SWITCH not in", values, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchBetween(Integer value1, Integer value2) {
            addCriterion("MATERIAL_SWITCH between", value1, value2, "materialSwitch");
            return (Criteria) this;
        }

        public Criteria andMaterialSwitchNotBetween(Integer value1, Integer value2) {
            addCriterion("MATERIAL_SWITCH not between", value1, value2, "materialSwitch");
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andUrlSIsNull() {
            addCriterion("URL_S is null");
            return (Criteria) this;
        }

        public Criteria andUrlSIsNotNull() {
            addCriterion("URL_S is not null");
            return (Criteria) this;
        }

        public Criteria andUrlSEqualTo(String value) {
            addCriterion("URL_S =", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSNotEqualTo(String value) {
            addCriterion("URL_S <>", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSGreaterThan(String value) {
            addCriterion("URL_S >", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSGreaterThanOrEqualTo(String value) {
            addCriterion("URL_S >=", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSLessThan(String value) {
            addCriterion("URL_S <", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSLessThanOrEqualTo(String value) {
            addCriterion("URL_S <=", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSLike(String value) {
            addCriterion("URL_S like", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSNotLike(String value) {
            addCriterion("URL_S not like", value, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSIn(List<String> values) {
            addCriterion("URL_S in", values, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSNotIn(List<String> values) {
            addCriterion("URL_S not in", values, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSBetween(String value1, String value2) {
            addCriterion("URL_S between", value1, value2, "urlS");
            return (Criteria) this;
        }

        public Criteria andUrlSNotBetween(String value1, String value2) {
            addCriterion("URL_S not between", value1, value2, "urlS");
            return (Criteria) this;
        }

        public Criteria andPathSIsNull() {
            addCriterion("PATH_S is null");
            return (Criteria) this;
        }

        public Criteria andPathSIsNotNull() {
            addCriterion("PATH_S is not null");
            return (Criteria) this;
        }

        public Criteria andPathSEqualTo(String value) {
            addCriterion("PATH_S =", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSNotEqualTo(String value) {
            addCriterion("PATH_S <>", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSGreaterThan(String value) {
            addCriterion("PATH_S >", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_S >=", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSLessThan(String value) {
            addCriterion("PATH_S <", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSLessThanOrEqualTo(String value) {
            addCriterion("PATH_S <=", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSLike(String value) {
            addCriterion("PATH_S like", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSNotLike(String value) {
            addCriterion("PATH_S not like", value, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSIn(List<String> values) {
            addCriterion("PATH_S in", values, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSNotIn(List<String> values) {
            addCriterion("PATH_S not in", values, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSBetween(String value1, String value2) {
            addCriterion("PATH_S between", value1, value2, "pathS");
            return (Criteria) this;
        }

        public Criteria andPathSNotBetween(String value1, String value2) {
            addCriterion("PATH_S not between", value1, value2, "pathS");
            return (Criteria) this;
        }

        public Criteria andSizeSIsNull() {
            addCriterion("SIZE_S is null");
            return (Criteria) this;
        }

        public Criteria andSizeSIsNotNull() {
            addCriterion("SIZE_S is not null");
            return (Criteria) this;
        }

        public Criteria andSizeSEqualTo(Long value) {
            addCriterion("SIZE_S =", value, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSNotEqualTo(Long value) {
            addCriterion("SIZE_S <>", value, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSGreaterThan(Long value) {
            addCriterion("SIZE_S >", value, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSGreaterThanOrEqualTo(Long value) {
            addCriterion("SIZE_S >=", value, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSLessThan(Long value) {
            addCriterion("SIZE_S <", value, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSLessThanOrEqualTo(Long value) {
            addCriterion("SIZE_S <=", value, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSIn(List<Long> values) {
            addCriterion("SIZE_S in", values, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSNotIn(List<Long> values) {
            addCriterion("SIZE_S not in", values, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSBetween(Long value1, Long value2) {
            addCriterion("SIZE_S between", value1, value2, "sizeS");
            return (Criteria) this;
        }

        public Criteria andSizeSNotBetween(Long value1, Long value2) {
            addCriterion("SIZE_S not between", value1, value2, "sizeS");
            return (Criteria) this;
        }

        public Criteria andUrlMIsNull() {
            addCriterion("URL_M is null");
            return (Criteria) this;
        }

        public Criteria andUrlMIsNotNull() {
            addCriterion("URL_M is not null");
            return (Criteria) this;
        }

        public Criteria andUrlMEqualTo(String value) {
            addCriterion("URL_M =", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMNotEqualTo(String value) {
            addCriterion("URL_M <>", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMGreaterThan(String value) {
            addCriterion("URL_M >", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMGreaterThanOrEqualTo(String value) {
            addCriterion("URL_M >=", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMLessThan(String value) {
            addCriterion("URL_M <", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMLessThanOrEqualTo(String value) {
            addCriterion("URL_M <=", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMLike(String value) {
            addCriterion("URL_M like", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMNotLike(String value) {
            addCriterion("URL_M not like", value, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMIn(List<String> values) {
            addCriterion("URL_M in", values, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMNotIn(List<String> values) {
            addCriterion("URL_M not in", values, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMBetween(String value1, String value2) {
            addCriterion("URL_M between", value1, value2, "urlM");
            return (Criteria) this;
        }

        public Criteria andUrlMNotBetween(String value1, String value2) {
            addCriterion("URL_M not between", value1, value2, "urlM");
            return (Criteria) this;
        }

        public Criteria andPathMIsNull() {
            addCriterion("PATH_M is null");
            return (Criteria) this;
        }

        public Criteria andPathMIsNotNull() {
            addCriterion("PATH_M is not null");
            return (Criteria) this;
        }

        public Criteria andPathMEqualTo(String value) {
            addCriterion("PATH_M =", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMNotEqualTo(String value) {
            addCriterion("PATH_M <>", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMGreaterThan(String value) {
            addCriterion("PATH_M >", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_M >=", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMLessThan(String value) {
            addCriterion("PATH_M <", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMLessThanOrEqualTo(String value) {
            addCriterion("PATH_M <=", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMLike(String value) {
            addCriterion("PATH_M like", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMNotLike(String value) {
            addCriterion("PATH_M not like", value, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMIn(List<String> values) {
            addCriterion("PATH_M in", values, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMNotIn(List<String> values) {
            addCriterion("PATH_M not in", values, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMBetween(String value1, String value2) {
            addCriterion("PATH_M between", value1, value2, "pathM");
            return (Criteria) this;
        }

        public Criteria andPathMNotBetween(String value1, String value2) {
            addCriterion("PATH_M not between", value1, value2, "pathM");
            return (Criteria) this;
        }

        public Criteria andSizeMIsNull() {
            addCriterion("SIZE_M is null");
            return (Criteria) this;
        }

        public Criteria andSizeMIsNotNull() {
            addCriterion("SIZE_M is not null");
            return (Criteria) this;
        }

        public Criteria andSizeMEqualTo(Long value) {
            addCriterion("SIZE_M =", value, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMNotEqualTo(Long value) {
            addCriterion("SIZE_M <>", value, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMGreaterThan(Long value) {
            addCriterion("SIZE_M >", value, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMGreaterThanOrEqualTo(Long value) {
            addCriterion("SIZE_M >=", value, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMLessThan(Long value) {
            addCriterion("SIZE_M <", value, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMLessThanOrEqualTo(Long value) {
            addCriterion("SIZE_M <=", value, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMIn(List<Long> values) {
            addCriterion("SIZE_M in", values, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMNotIn(List<Long> values) {
            addCriterion("SIZE_M not in", values, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMBetween(Long value1, Long value2) {
            addCriterion("SIZE_M between", value1, value2, "sizeM");
            return (Criteria) this;
        }

        public Criteria andSizeMNotBetween(Long value1, Long value2) {
            addCriterion("SIZE_M not between", value1, value2, "sizeM");
            return (Criteria) this;
        }

        public Criteria andUrlLIsNull() {
            addCriterion("URL_L is null");
            return (Criteria) this;
        }

        public Criteria andUrlLIsNotNull() {
            addCriterion("URL_L is not null");
            return (Criteria) this;
        }

        public Criteria andUrlLEqualTo(String value) {
            addCriterion("URL_L =", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLNotEqualTo(String value) {
            addCriterion("URL_L <>", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLGreaterThan(String value) {
            addCriterion("URL_L >", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLGreaterThanOrEqualTo(String value) {
            addCriterion("URL_L >=", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLLessThan(String value) {
            addCriterion("URL_L <", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLLessThanOrEqualTo(String value) {
            addCriterion("URL_L <=", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLLike(String value) {
            addCriterion("URL_L like", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLNotLike(String value) {
            addCriterion("URL_L not like", value, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLIn(List<String> values) {
            addCriterion("URL_L in", values, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLNotIn(List<String> values) {
            addCriterion("URL_L not in", values, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLBetween(String value1, String value2) {
            addCriterion("URL_L between", value1, value2, "urlL");
            return (Criteria) this;
        }

        public Criteria andUrlLNotBetween(String value1, String value2) {
            addCriterion("URL_L not between", value1, value2, "urlL");
            return (Criteria) this;
        }

        public Criteria andPathLIsNull() {
            addCriterion("PATH_L is null");
            return (Criteria) this;
        }

        public Criteria andPathLIsNotNull() {
            addCriterion("PATH_L is not null");
            return (Criteria) this;
        }

        public Criteria andPathLEqualTo(String value) {
            addCriterion("PATH_L =", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLNotEqualTo(String value) {
            addCriterion("PATH_L <>", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLGreaterThan(String value) {
            addCriterion("PATH_L >", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLGreaterThanOrEqualTo(String value) {
            addCriterion("PATH_L >=", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLLessThan(String value) {
            addCriterion("PATH_L <", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLLessThanOrEqualTo(String value) {
            addCriterion("PATH_L <=", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLLike(String value) {
            addCriterion("PATH_L like", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLNotLike(String value) {
            addCriterion("PATH_L not like", value, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLIn(List<String> values) {
            addCriterion("PATH_L in", values, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLNotIn(List<String> values) {
            addCriterion("PATH_L not in", values, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLBetween(String value1, String value2) {
            addCriterion("PATH_L between", value1, value2, "pathL");
            return (Criteria) this;
        }

        public Criteria andPathLNotBetween(String value1, String value2) {
            addCriterion("PATH_L not between", value1, value2, "pathL");
            return (Criteria) this;
        }

        public Criteria andSizeLIsNull() {
            addCriterion("SIZE_L is null");
            return (Criteria) this;
        }

        public Criteria andSizeLIsNotNull() {
            addCriterion("SIZE_L is not null");
            return (Criteria) this;
        }

        public Criteria andSizeLEqualTo(Long value) {
            addCriterion("SIZE_L =", value, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLNotEqualTo(Long value) {
            addCriterion("SIZE_L <>", value, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLGreaterThan(Long value) {
            addCriterion("SIZE_L >", value, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLGreaterThanOrEqualTo(Long value) {
            addCriterion("SIZE_L >=", value, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLLessThan(Long value) {
            addCriterion("SIZE_L <", value, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLLessThanOrEqualTo(Long value) {
            addCriterion("SIZE_L <=", value, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLIn(List<Long> values) {
            addCriterion("SIZE_L in", values, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLNotIn(List<Long> values) {
            addCriterion("SIZE_L not in", values, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLBetween(Long value1, Long value2) {
            addCriterion("SIZE_L between", value1, value2, "sizeL");
            return (Criteria) this;
        }

        public Criteria andSizeLNotBetween(Long value1, Long value2) {
            addCriterion("SIZE_L not between", value1, value2, "sizeL");
            return (Criteria) this;
        }

        public Criteria andDurationMIsNull() {
            addCriterion("DURATION_M is null");
            return (Criteria) this;
        }

        public Criteria andDurationMIsNotNull() {
            addCriterion("DURATION_M is not null");
            return (Criteria) this;
        }

        public Criteria andDurationMEqualTo(Long value) {
            addCriterion("DURATION_M =", value, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMNotEqualTo(Long value) {
            addCriterion("DURATION_M <>", value, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMGreaterThan(Long value) {
            addCriterion("DURATION_M >", value, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMGreaterThanOrEqualTo(Long value) {
            addCriterion("DURATION_M >=", value, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMLessThan(Long value) {
            addCriterion("DURATION_M <", value, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMLessThanOrEqualTo(Long value) {
            addCriterion("DURATION_M <=", value, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMIn(List<Long> values) {
            addCriterion("DURATION_M in", values, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMNotIn(List<Long> values) {
            addCriterion("DURATION_M not in", values, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMBetween(Long value1, Long value2) {
            addCriterion("DURATION_M between", value1, value2, "durationM");
            return (Criteria) this;
        }

        public Criteria andDurationMNotBetween(Long value1, Long value2) {
            addCriterion("DURATION_M not between", value1, value2, "durationM");
            return (Criteria) this;
        }

        public Criteria andAsytaskidIsNull() {
            addCriterion("ASYTASKID is null");
            return (Criteria) this;
        }

        public Criteria andAsytaskidIsNotNull() {
            addCriterion("ASYTASKID is not null");
            return (Criteria) this;
        }

        public Criteria andAsytaskidEqualTo(Long value) {
            addCriterion("ASYTASKID =", value, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidNotEqualTo(Long value) {
            addCriterion("ASYTASKID <>", value, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidGreaterThan(Long value) {
            addCriterion("ASYTASKID >", value, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidGreaterThanOrEqualTo(Long value) {
            addCriterion("ASYTASKID >=", value, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidLessThan(Long value) {
            addCriterion("ASYTASKID <", value, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidLessThanOrEqualTo(Long value) {
            addCriterion("ASYTASKID <=", value, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidIn(List<Long> values) {
            addCriterion("ASYTASKID in", values, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidNotIn(List<Long> values) {
            addCriterion("ASYTASKID not in", values, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidBetween(Long value1, Long value2) {
            addCriterion("ASYTASKID between", value1, value2, "asytaskid");
            return (Criteria) this;
        }

        public Criteria andAsytaskidNotBetween(Long value1, Long value2) {
            addCriterion("ASYTASKID not between", value1, value2, "asytaskid");
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