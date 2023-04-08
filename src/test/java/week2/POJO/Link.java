package week2.POJO;


import com.fasterxml.jackson.annotation.*;
import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@ToString
public class Link {

    @JsonProperty("rel")
    private String rel;
    @JsonProperty("href")
    private String href;


}
