CREATE TABLE categories
(
    id               BIGINT       NOT NULL,
    craeteddate      datetime     NULL,
    lastmodifieddate datetime     NULL,
    name             VARCHAR(255) NULL,
    `description`    VARCHAR(255) NULL,
    CONSTRAINT pk_categories PRIMARY KEY (id)
);

CREATE TABLE jt_instructor
(
    user_id BIGINT       NOT NULL,
    company VARCHAR(255) NULL,
    CONSTRAINT pk_jt_instructor PRIMARY KEY (user_id)
);

CREATE TABLE jt_mentor
(
    user_id  BIGINT NOT NULL,
    gradyear INT    NOT NULL,
    CONSTRAINT pk_jt_mentor PRIMARY KEY (user_id)
);

CREATE TABLE jt_ta
(
    user_id BIGINT NOT NULL,
    rating  DOUBLE NOT NULL,
    CONSTRAINT pk_jt_ta PRIMARY KEY (user_id)
);

CREATE TABLE jt_user
(
    id    BIGINT       NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    CONSTRAINT pk_jt_user PRIMARY KEY (id)
);

CREATE TABLE mp_instructor
(
    id      BIGINT       NOT NULL,
    name    VARCHAR(255) NULL,
    email   VARCHAR(255) NULL,
    company VARCHAR(255) NULL,
    CONSTRAINT pk_mp_instructor PRIMARY KEY (id)
);

CREATE TABLE mp_mentor
(
    id       BIGINT       NOT NULL,
    name     VARCHAR(255) NULL,
    email    VARCHAR(255) NULL,
    gradyear INT          NOT NULL,
    CONSTRAINT pk_mp_mentor PRIMARY KEY (id)
);

CREATE TABLE mp_ta
(
    id     BIGINT       NOT NULL,
    name   VARCHAR(255) NULL,
    email  VARCHAR(255) NULL,
    rating DOUBLE       NOT NULL,
    CONSTRAINT pk_mp_ta PRIMARY KEY (id)
);

CREATE TABLE product
(
    id               BIGINT       NOT NULL,
    craeteddate      datetime     NULL,
    lastmodifieddate datetime     NULL,
    title            VARCHAR(255) NULL,
    price            DOUBLE       NOT NULL,
    `description`    VARCHAR(255) NULL,
    category_id      BIGINT       NULL,
    imageurl         VARCHAR(255) NULL,
    is_public        BIT(1)       NULL,
    number_of_units  INT          NOT NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

CREATE TABLE sc_user
(
    id        BIGINT       NOT NULL,
    user_type INT          NULL,
    name      VARCHAR(255) NULL,
    email     VARCHAR(255) NULL,
    company   VARCHAR(255) NULL,
    rating    DOUBLE       NOT NULL,
    gradyear  INT          NOT NULL,
    CONSTRAINT pk_sc_user PRIMARY KEY (id)
);

CREATE TABLE tpc_instructor
(
    id      BIGINT       NOT NULL,
    name    VARCHAR(255) NULL,
    email   VARCHAR(255) NULL,
    company VARCHAR(255) NULL,
    CONSTRAINT pk_tpc_instructor PRIMARY KEY (id)
);

CREATE TABLE tpc_mentor
(
    id       BIGINT       NOT NULL,
    name     VARCHAR(255) NULL,
    email    VARCHAR(255) NULL,
    gradyear INT          NOT NULL,
    CONSTRAINT pk_tpc_mentor PRIMARY KEY (id)
);

CREATE TABLE tpc_ta
(
    id     BIGINT       NOT NULL,
    name   VARCHAR(255) NULL,
    email  VARCHAR(255) NULL,
    rating DOUBLE       NOT NULL,
    CONSTRAINT pk_tpc_ta PRIMARY KEY (id)
);

CREATE TABLE tpc_user
(
    id    BIGINT       NOT NULL,
    name  VARCHAR(255) NULL,
    email VARCHAR(255) NULL,
    CONSTRAINT pk_tpc_user PRIMARY KEY (id)
);

ALTER TABLE jt_instructor
    ADD CONSTRAINT FK_JT_INSTRUCTOR_ON_USER FOREIGN KEY (user_id) REFERENCES jt_user (id);

ALTER TABLE jt_mentor
    ADD CONSTRAINT FK_JT_MENTOR_ON_USER FOREIGN KEY (user_id) REFERENCES jt_user (id);

ALTER TABLE jt_ta
    ADD CONSTRAINT FK_JT_TA_ON_USER FOREIGN KEY (user_id) REFERENCES jt_user (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES categories (id);