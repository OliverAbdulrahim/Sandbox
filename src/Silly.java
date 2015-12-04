import java.lang.*;

/**
 * Don't ask why I made this.
 *
 * @author Oliver Abdulrahim
 * @version 2.147.4.83.6.48
 * @apiNote TURN BACK
 * @see Silly
 * @since never
 * @deprecated Use the {@link Silly} class.
 */
public class Silly {

    // make a class called A
    class A {
        /**
         * this class inherits itself because inheritance or something
         */
        class B extends A {
            B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B yesThisCompiles;
        }
        // make our A.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B variable
        A.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B.B worksHereToo;
    }

    // our class
    protected static abstract class TooLongDidNotRead<T extends Comparable<T>>
        extends Silly
        implements java.lang.Runnable, // for polymorphism
            java.lang.Appendable,
            java.lang.Comparable<T>, // parameterization is good
            java.lang.AutoCloseable,
            java.lang.Readable
    {
        // thanks IntelliJ for these identifiers
        protected static synchronized strictfp final
                <T extends ReflectiveOperationException> void aVoid(
                Comparable<Comparable<T>>... comparableComparable)
        {
            // this operation is implementation-dependent and makes no
            // guarantees on the concurrency or the erasure of returned
            // parameterized types. strictly non-deterministic (i think)
            return;
        }

        /**
         * new oop pattern. private so bad people can't access it
         *
         * @return This object
         */
        private TooLongDidNotRead getThis() {
            // need this because computers are really fast so returning this too
            // quickly might cause this object to block - so we have to slow it
            // down a bit. true story
            for (int i = 011145401322; i > 0; i--) { } // our for loop
            return this;
        }

        // TODO make it good

    }

}
