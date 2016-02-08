package org.example.ronaldschildge.criminalintent;

import java.util.UUID;

/**
 * Created by ronaldschildge on 11/6/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
    }
}
