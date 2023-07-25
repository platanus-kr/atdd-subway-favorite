package subway.acceptance.favorite;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import subway.utils.AcceptanceTest;

public class FavoriteAcceptanceTest extends AcceptanceTest {

    /**
     * 즐겨찾기 생성
     */
    @DisplayName("즐겨찾기를 만든다.")
    @Test
    void createFavorite() {
        // given

        // when

        // then
    }

    /**
     * 즐겨찾기 조회
     */
    @DisplayName("즐겨찾기를 조회한다.")
    @Test
    void retrieveFavorites() {

    }

    /**
     * 즐겨찾기 삭제
     */
    @DisplayName("즐겨찾기를 삭제한다.")
    @Test
    void removeFavorite() {

    }

    /**
     * 이어지지 않는 경로로 생성을 할 수 없다. (문서 스팩)
     */
    @DisplayName("이어지지 않는 경로로 즐겨찾기를 생성 할 수 없다.")
    @Test
    void createFavoriteWithNotConnectedSections() {

    }

    /**
     * 없는 즐겨찾기를 조회 할 수 없다.
     */
    @DisplayName("없는 즐겨찾기를 조회 할 수 없다.")
    @Test
    void retrieveFavoriteWithNotExist() {

    }

    /**
     * 없는 즐겨찾기를 삭제할 수 없다.
     */
    @DisplayName("없는 즐겨찾기를 삭제할 수 없다.")
    @Test
    void removeFavoriteWithNotExist() {

    }


    // 여기서부터는 옵셔널..

    /**
     * 자신의 소유가 아닌 즐겨찾기는 조회 할 수 없다.
     */
    @DisplayName("자신의 소유가 아닌 즐겨찾기는 조회 할 수 없다.")
    @Test
    void retrieveFavoriteWithNotOwner() {

    }

    /**
     * 자신의 소유가 아닌 즐겨찾기는 삭제 할 수 없다.
     */
    @DisplayName("자신의 소유가 아닌 즐겨찾기는 삭제 할 수 없다.")
    @Test
    void removeFavoriteWithNotOwner() {

    }

}
