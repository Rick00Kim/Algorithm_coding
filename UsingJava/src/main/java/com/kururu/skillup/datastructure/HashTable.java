package com.kururu.skillup.datastructure;

import java.util.LinkedList;

/**
 * <h3>Data structure</h3>
 * Hash Table
 */
public class HashTable {

    /* Hash table Array of LinkedList */
    private final LinkedList<Node>[] data;

    /* Constructor (Initialize with array size)*/
    public HashTable(final int size) {
        this.data = new LinkedList[size];
    }

    /* Override getHashCode (Sum of Key's ASCII code) */
    public int getHashCode(final String key) {
        int hashcode = 0;
        // Sum all character(ASCII) of String key
        for (final char c : key.toCharArray()) {
            hashcode += c;
        }
        return hashcode;
    }

    /* Search Key */
    public Node searchKey(final LinkedList<Node> list, final String key) {
        if (list == null) return null;
        for (final Node node : list) {
            if (node.getKey().equals(key)) {
                return node;
            }
        }
        return null;
    }

    /* Put to Hash table */
    public void put(final String key, final String value) {
        int index = convertToIndex(getHashCode(key));
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if (node == null) {
            list.addLast(new Node(key, value));
        } else {
            node.setValue(value);
        }
    }

    /* Get from Hash table */
    public String get(final String key) {
        int index = convertToIndex(getHashCode(key));
        final LinkedList<Node> list = data[index];
        final Node node = searchKey(list, key);
        return node == null ? "Not Found" : node.getValue();
    }

    /* Convert to Index(Divide hashcode by length of hash table array) */
    public int convertToIndex(int hashcode) {
        return hashcode & data.length;
    }

    /* Node */
    public static class Node {
        private final String key;
        private String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
