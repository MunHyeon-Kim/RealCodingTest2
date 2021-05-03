package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Champion {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String position;

    public int getHasSkinCount() {
        return hasSkinCount;
    }

    public void setHasSkinCount(int hasSkinCount) {
        this.hasSkinCount = hasSkinCount;
    }

    private int hasSkinCount;
}
