package enums;

import lombok.Getter;
@Getter
public enum TitlesEnum {

    MR("Mr"),
    MRS("Mrs"),
    MS("Ms");

    private final String titleName;

    TitlesEnum(String titleName) {
        this.titleName = titleName;
    }

}
