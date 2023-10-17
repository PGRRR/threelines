create table `member` (
                          `member_no` bigint auto_increment primary key,
                          `member_email` varchar(255) null,
                          `member_nm` varchar(255) null,
                          `member_pw` varchar(255) null,
                          `created_by` bigint null,
                          `created_at` datetime null,
                          `modified_by` bigint null,
                          `modified_at` datetime null
);

create table `subscription` (
                                `sub_no` bigint auto_increment primary key,
                                `sub_title` varchar(255) null,
                                `sub_type` varchar(255) null,
                                `member_no` bigint not null,
                                `created_by` bigint null,
                                `created_at` datetime null,
                                `modified_by` bigint null,
                                `modified_at` datetime null
);

create table `content` (
                           `content_no` bigint auto_increment primary key,
                           `content_title` varchar(255) null,
                           `content_addr` varchar(255) null,
                           `content_lang_code` char(2) null,
                           `content_summary` text null,
                           `content_type` varchar(255) null,
                           `sub_no` bigint not null,
                           `created_by` bigint null,
                           `created_at` datetime null,
                           `modified_by` bigint null,
                           `modified_at` datetime null
);
