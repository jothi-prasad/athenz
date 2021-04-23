ALTER TABLE `zts_store`.`workloads`
ADD COLUMN `hostname` VARCHAR(256) NOT NULL,
ADD COLUMN `certExpiryTime` DATETIME(3) NOT NULL;
