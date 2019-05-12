package com.google.cloud.storage.demo.n_0003_查看存储分区列表;

// Imports the Google Cloud client library
import com.google.api.gax.paging.Page;
import com.google.cloud.storage.*;

public class Run {
    public static void main(String... args) throws Exception {
        // Instantiates a client
        Storage storage = StorageOptions.getDefaultInstance().getService();

        //String prefix = "thinktothings";
        String prefix = "";

        Page<Bucket> buckets =
                storage.list(Storage.BucketListOption.pageSize(100), Storage.BucketListOption.prefix(prefix));
        for (Bucket bucket : buckets.iterateAll()) {
            System.out.printf("Bucket %s created.%n", bucket.getName());
        }
    }
}