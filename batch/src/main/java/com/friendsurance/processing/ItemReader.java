package com.friendsurance.processing;

/**
 * Provides items to ItemProcessing independently of the source they are
 * taken from.
 * 
 * @author SUBBU
 */
public interface ItemReader<I> {

    /**
     * Retrieves <b>next</b> item which can be processed by ItemProcessing.
     * When there are no more new items it will return null.
     */
    I read();

}
