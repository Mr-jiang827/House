package com.housedemo.houseapi.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TUserratingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TUserratingExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRatingtimeIsNull() {
            addCriterion("ratingtime is null");
            return (Criteria) this;
        }

        public Criteria andRatingtimeIsNotNull() {
            addCriterion("ratingtime is not null");
            return (Criteria) this;
        }

        public Criteria andRatingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("ratingtime =", value, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ratingtime <>", value, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ratingtime >", value, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ratingtime >=", value, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeLessThan(Date value) {
            addCriterionForJDBCDate("ratingtime <", value, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ratingtime <=", value, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("ratingtime in", values, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ratingtime not in", values, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ratingtime between", value1, value2, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ratingtime not between", value1, value2, "ratingtime");
            return (Criteria) this;
        }

        public Criteria andRatingcontentIsNull() {
            addCriterion("ratingcontent is null");
            return (Criteria) this;
        }

        public Criteria andRatingcontentIsNotNull() {
            addCriterion("ratingcontent is not null");
            return (Criteria) this;
        }

        public Criteria andRatingcontentEqualTo(String value) {
            addCriterion("ratingcontent =", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentNotEqualTo(String value) {
            addCriterion("ratingcontent <>", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentGreaterThan(String value) {
            addCriterion("ratingcontent >", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ratingcontent >=", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentLessThan(String value) {
            addCriterion("ratingcontent <", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentLessThanOrEqualTo(String value) {
            addCriterion("ratingcontent <=", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentLike(String value) {
            addCriterion("ratingcontent like", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentNotLike(String value) {
            addCriterion("ratingcontent not like", value, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentIn(List<String> values) {
            addCriterion("ratingcontent in", values, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentNotIn(List<String> values) {
            addCriterion("ratingcontent not in", values, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentBetween(String value1, String value2) {
            addCriterion("ratingcontent between", value1, value2, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andRatingcontentNotBetween(String value1, String value2) {
            addCriterion("ratingcontent not between", value1, value2, "ratingcontent");
            return (Criteria) this;
        }

        public Criteria andHousedetidIsNull() {
            addCriterion("housedetid is null");
            return (Criteria) this;
        }

        public Criteria andHousedetidIsNotNull() {
            addCriterion("housedetid is not null");
            return (Criteria) this;
        }

        public Criteria andHousedetidEqualTo(Integer value) {
            addCriterion("housedetid =", value, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidNotEqualTo(Integer value) {
            addCriterion("housedetid <>", value, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidGreaterThan(Integer value) {
            addCriterion("housedetid >", value, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidGreaterThanOrEqualTo(Integer value) {
            addCriterion("housedetid >=", value, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidLessThan(Integer value) {
            addCriterion("housedetid <", value, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidLessThanOrEqualTo(Integer value) {
            addCriterion("housedetid <=", value, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidIn(List<Integer> values) {
            addCriterion("housedetid in", values, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidNotIn(List<Integer> values) {
            addCriterion("housedetid not in", values, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidBetween(Integer value1, Integer value2) {
            addCriterion("housedetid between", value1, value2, "housedetid");
            return (Criteria) this;
        }

        public Criteria andHousedetidNotBetween(Integer value1, Integer value2) {
            addCriterion("housedetid not between", value1, value2, "housedetid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNull() {
            addCriterion("jurisdictionid is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIsNotNull() {
            addCriterion("jurisdictionid is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidEqualTo(Integer value) {
            addCriterion("jurisdictionid =", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotEqualTo(Integer value) {
            addCriterion("jurisdictionid <>", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThan(Integer value) {
            addCriterion("jurisdictionid >", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jurisdictionid >=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThan(Integer value) {
            addCriterion("jurisdictionid <", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidLessThanOrEqualTo(Integer value) {
            addCriterion("jurisdictionid <=", value, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidIn(List<Integer> values) {
            addCriterion("jurisdictionid in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotIn(List<Integer> values) {
            addCriterion("jurisdictionid not in", values, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidBetween(Integer value1, Integer value2) {
            addCriterion("jurisdictionid between", value1, value2, "jurisdictionid");
            return (Criteria) this;
        }

        public Criteria andJurisdictionidNotBetween(Integer value1, Integer value2) {
            addCriterion("jurisdictionid not between", value1, value2, "jurisdictionid");
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