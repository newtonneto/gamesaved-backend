package com.gamesaved.api.domain.enums;

import lombok.Getter;

@Getter
public enum Platforms {
    XBO(1, "Microsoft Xbox One"),
    IOS(3, "Apple iOS"),
    WPC(4, "Microsoft Windows"),
    MOS(5, "Apple MacOS"),
    LIX(6, "Linux"),
    NSW(7, "Nintendo Switch"),
    N3DS(8, "Nintendo 3DS"),
    NDS(9, "Nintendo DS"),
    NWIIU(10, "Nintendo WiiU"),
    NWII(11, "Nintendo Wii"),
    NDSI(13, "Nintendo DSi"),
    XB360(14, "Microsoft Xbox 360"),
    PS2(15, "Sony PlayStation 2"),
    PS3(16, "Sony PlayStation 3"),
    PSP(17, "Sony Playstation Portable"),
    PS4(18, "Sony PlayStation 4"),
    PSV(19, "Sony PS Vita"),
    GA(21, "Goggle Android"),
    GBA(24, "Nintendo Game Boy Advanced"),
    GB(26, "Nintendo Game Boy"),
    PSX(27, "Sony PlayStation"),
    GBC(43, "Nintendo Game Boy Color"),
    NES(49, "Nintendo NES"),
    SMS(74, "SEGA Master System"),
    SNES(79, "Nintendo SNES"),
    XB(80, "Microsoft Xbox"),
    N64(83, "Nintendo 64"),
    NGC(105, "Nintendo GameCube"),
    DC(106, "SEGA DreamCast"),
    SAT(107, "SEGA Saturn"),
    SCD(119, "SEGA CD"),
    MD(167, "SEGA Mega Drive"),
    XBS(186, "Microsoft Xbox Series S/X"),
    PS5(187, "Sony PlayStation 5");

    private int cod;
    private String name;

    private Platforms(int cod, String name) {
        this.cod = cod;
        this.name = name;
    }

    public static Platforms toEnum(Integer cod) {
        if (cod == null) return null;

        for (Platforms x : Platforms.values()) {
            if (cod.equals(x.getCod())) return x;
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
