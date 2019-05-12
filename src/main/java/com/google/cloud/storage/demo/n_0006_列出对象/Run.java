package com.google.cloud.storage.demo.n_0006_列出对象;

// Imports the Google Cloud client library

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.*;

public class Run {
    public static void main(String... args) throws Exception {


        // Instantiates a client
        Storage storage = StorageOptions.getDefaultInstance().getService();

        String prefix = "thinktothings.com";

        Page<Bucket> buckets =
                storage.list(Storage.BucketListOption.pageSize(100), Storage.BucketListOption.prefix(prefix));
        for (Bucket bucket : buckets.iterateAll()) {

            Page<Blob> blobs = bucket.list();
            for (Blob blob : blobs.iterateAll()) {
                // do something with the blob
                System.out.println(blob.getName());
                System.out.println(blob.getContentType());
            }
        }





    }
}