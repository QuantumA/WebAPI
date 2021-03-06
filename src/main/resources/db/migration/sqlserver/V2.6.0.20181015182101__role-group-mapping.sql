ALTER TABLE ${ohdsiSchema}.sec_role_group ADD job_id BIGINT;

ALTER TABLE ${ohdsiSchema}.sec_role_group
    ADD CONSTRAINT fk_role_group_job FOREIGN KEY(job_id)
    REFERENCES ${ohdsiSchema}.user_import_job(id) ON UPDATE NO ACTION ON DELETE CASCADE;

ALTER TABLE ${ohdsiSchema}.sec_role_group DROP CONSTRAINT UC_PROVIDER_GROUP_ROLE;

ALTER TABLE ${ohdsiSchema}.sec_role_group
    ALTER COLUMN [provider] VARCHAR(100);
ALTER TABLE ${ohdsiSchema}.sec_role_group
    ALTER COLUMN group_dn VARCHAR(4000);
ALTER TABLE ${ohdsiSchema}.sec_role_group
    ALTER COLUMN group_name VARCHAR(1000);

ALTER TABLE ${ohdsiSchema}.sec_role_group
    ADD CONSTRAINT UC_PROVIDER_GROUP_ROLE UNIQUE(provider, group_dn, role_id, job_id);