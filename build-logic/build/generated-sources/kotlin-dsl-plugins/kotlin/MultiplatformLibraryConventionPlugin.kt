/**
 * Precompiled [multiplatform-library-convention.gradle.kts][Multiplatform_library_convention_gradle] script plugin.
 *
 * @see Multiplatform_library_convention_gradle
 */
public
class MultiplatformLibraryConventionPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Multiplatform_library_convention_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
