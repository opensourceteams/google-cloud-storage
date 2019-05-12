package com.google.cloud.storage.demo.n_0004_删除存储分区;

// Imports the Google Cloud client library

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;

public class Run {
    public static void main(String... args) throws Exception {
        // Instantiates a client
        Storage storage = StorageOptions.getDefaultInstance().getService();

        String prefix = "thinktothingsf";

        Page<Bucket> buckets =
                storage.list(Storage.BucketListOption.pageSize(100), Storage.BucketListOption.prefix(prefix));
        for (Bucket bucket : buckets.iterateAll()) {
            System.out.printf("Bucket %s created.%n", bucket.getName());

            boolean deleted = bucket.delete(Bucket.BucketSourceOption.metagenerationMatch());
            if (deleted) {
                // the bucket was deleted
                System.out.println("删除成功");
            } else {
                // the bucket was not found
                System.out.println("删除失败");
            }
        }
    }
}