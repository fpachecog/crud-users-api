
package cl.bci.api.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "number",
    "citycode",
    "contrycode"
})
@Generated("jsonschema2pojo")
public class Phone {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    private String number;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("citycode")
    private String citycode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contrycode")
    private String contrycode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("citycode")
    public String getCitycode() {
        return citycode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("citycode")
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contrycode")
    public String getContrycode() {
        return contrycode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contrycode")
    public void setContrycode(String contrycode) {
        this.contrycode = contrycode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Phone.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("citycode");
        sb.append('=');
        sb.append(((this.citycode == null)?"<null>":this.citycode));
        sb.append(',');
        sb.append("contrycode");
        sb.append('=');
        sb.append(((this.contrycode == null)?"<null>":this.contrycode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.number == null)? 0 :this.number.hashCode()));
        result = ((result* 31)+((this.contrycode == null)? 0 :this.contrycode.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.citycode == null)? 0 :this.citycode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Phone) == false) {
            return false;
        }
        Phone rhs = ((Phone) other);
        return (((((this.number == rhs.number)||((this.number!= null)&&this.number.equals(rhs.number)))&&((this.contrycode == rhs.contrycode)||((this.contrycode!= null)&&this.contrycode.equals(rhs.contrycode))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.citycode == rhs.citycode)||((this.citycode!= null)&&this.citycode.equals(rhs.citycode))));
    }

}
