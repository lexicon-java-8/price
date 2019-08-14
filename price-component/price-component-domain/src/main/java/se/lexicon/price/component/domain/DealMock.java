package se.lexicon.price.component.domain;


import com.so4it.annotation.Allowed;
import com.so4it.common.util.object.Required;
import com.so4it.common.util.object.ValueObject;

import java.io.Serializable;


public class DealMock extends ValueObject implements Serializable {

    @Allowed(value = "Auto generated by GS",types = {Allowed.Type.NULLABLE})
    private String id;

    private String instrument;

    private Boolean closed;

    private Money value;

    private DealMock(){

    }


    private DealMock(Builder builder){
        this.id=Required.notNull(builder.id,"id");
        this.instrument= Required.notNull(builder.instrument,"instrument");
        this.closed =Required.notNull(builder.closed,"closed");
        this.value = builder.value;
    }


    public String getId() {
        return id;
    }


    public String getInstrument(){
        return instrument;
    }


    public Money getValue() {
        return value;
    }

    public Boolean getClosed() {
        return closed;
    }

    @Override
    protected Object[] getIdFields() {
        return new Object[]{id,instrument,value};
    }


    public static Builder builder(){
        return new Builder();
    }


    public static class Builder implements com.so4it.common.builder.Builder<DealMock>{

        private String id;
        private String instrument;
        private Boolean closed;
        private Money value;


        public DealMock.Builder withId(String id){
            this.id=id;
            return this;
        }

        public DealMock.Builder withInstrument(String instrument){
            this.instrument=instrument;
            return this;
        }

        public DealMock.Builder withClosed(Boolean closed){
            this.closed=closed;
            return this;
        }

        public DealMock.Builder withValue(Money value){
            this.value=value;
            return this;
        }

        @Override
        public DealMock build() {
            return new DealMock(this);
        }
    }
    }

