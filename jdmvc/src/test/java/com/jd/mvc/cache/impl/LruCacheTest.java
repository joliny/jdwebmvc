package com.jd.mvc.cache.impl;

import org.junit.Test;

import com.jd.mvc.cache.face.ICache;
import com.jd.mvc.cache.face.impl.CacheImpl;

public class LruCacheTest {
	@Test
    public void test () {
		ICache<Integer, Integer> cache = new CacheImpl<Integer, Integer> ( 4 );


        cache.put ( 0, 0 );
        cache.put ( 1, 1 );

        cache.put ( 2, 2 );
        cache.put ( 3, 3 );
        
        /*System.out.println(cache.size());
        System.out.println(cache.get(1));
        System.out.println(cache.getSilent(2));*/
    }

}
