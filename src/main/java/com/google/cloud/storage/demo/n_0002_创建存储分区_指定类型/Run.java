package com.google.cloud.storage.demo.n_0002_创建存储分区_指定类型;

// Imports the Google Cloud client library
import com.google.cloud.storage.*;

public class Run {
    public static void main(String... args) throws Exception {
        // Instantiates a client
        Storage storage = StorageOptions.getDefaultInstance().getService();

        if(args == null || args.length ==0){
            args = new String[1];
            args[0] = "thinktothings";
        }

        String location = "asia-east2"; //asia-east2 (香港)
        // The name for the new bucket
        String bucketName = args[0];  // "my-new-bucket";

        // Creates the new bucket
        Bucket bucket = storage.create(BucketInfo.newBuilder(bucketName).setStorageClass(StorageClass.REGIONAL).setLocation(location).build()) ;

        System.out.printf("Bucket %s created.%n", bucket.getName());
    }
}