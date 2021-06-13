package com.kururu.skillup.datastructure;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Executor {
    public static void main(String[] args) {
        executeStack();
        executeHashTable();
    }

    public static void executeStack() {
        Stack<Integer> stackInstance = new Stack<>(5);
        stackInstance.pop();
        log.info(String.format("IS EMPTY -> \t%s", stackInstance.isEmpty()));
        stackInstance.push(3);
        log.info(String.format("IS EMPTY -> \t%s", stackInstance.isEmpty()));
        stackInstance.pop();
        log.info(String.format("IS EMPTY -> \t%s", stackInstance.isEmpty()));
        stackInstance.push(10);
        stackInstance.push(321);
        stackInstance.push(22);
        stackInstance.push(32);
        stackInstance.push(1000);
        log.info(String.format("IS Stack status -> \t%s", stackInstance));
        log.info(String.format("IS FULL -> \t%s", stackInstance.isFull()));
        log.info(String.format("IS PEEK -> \t%s", stackInstance.peek()));
        log.info(String.format("IS POP -> \t%s", stackInstance.pop()));
        log.info(String.format("IS PEEK -> \t%s", stackInstance.peek()));
        log.info(String.format("IS FULL -> \t%s", stackInstance.isFull()));
    }

    public static void executeHashTable() {
        final HashTable hashTable = new HashTable(5);
        hashTable.put("key1", "value1");
        hashTable.put("key2", "value2");
        hashTable.put("key3", "value3");

        log.info(String.format("Key1's value is [%s]", hashTable.get("key1")));
        log.info(String.format("Key2's value is [%s]", hashTable.get("key2")));
        log.info(String.format("Key3's value is [%s]", hashTable.get("key3")));

        hashTable.put("key1", "updatedValue");
        log.info(String.format("Key1's updated value is [%s]", hashTable.get("key1")));
    }
}
