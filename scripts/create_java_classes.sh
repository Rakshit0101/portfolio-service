#!/bin/bash

# This script creates Java class files within the existing package structure.
# It assumes you are running it from the 'portfolio' directory.
# run this file when you are at portfolio rakshit@Mac portfolio dev $ ~/Developer/portfolio-service/scripts/create_java_classes.sh , then this will create files under src/main/java/com/site/portfolio
# it doesnt matter where the file lies , only thing matter from where you are executing command.
echo "Creating missing Java class files in the current directory and its subdirectories..."

# Function to create a Java class file with basic boilerplate
# Arguments:
#   $1: relative_dir - The directory path relative to the current working directory (e.g., ".", "config", "controller")
#   $2: class_name   - The name of the Java class (e.g., "PortfolioServiceApplication", "CorsConfig")
create_java_class() {
    local relative_dir=$1
    local class_name=$2
    local full_file_path="$relative_dir/$class_name.java" # Path to the new .java file

    # Determine the full Java package name for the file's content
    # The base package is 'com.site.portfolio'
    local base_java_package="com.site.portfolio"
    local final_java_package_declaration="$base_java_package"

    # If the class is in a subdirectory (e.g., 'config', 'controller'), append that to the package name
    if [ "$relative_dir" != "." ]; then
        # Convert directory slashes to dots for the package name
        local sub_package=$(echo "$relative_dir" | sed 's/\//\./g')
        final_java_package_declaration="$base_java_package.$sub_package"
    fi

    # Ensure the directory for the class file exists.
    # The -p flag means "create parent directories as needed, and do not error if directory exists".
    mkdir -p "$(dirname "$full_file_path")"

    # Write the Java class content to the file
    cat << EOF > "$full_file_path"
package $final_java_package_declaration;

public class $class_name {
    // TODO: Add class implementation here
}
EOF
    echo "Created: $full_file_path"
}

# --- Create individual class files based on your project structure ---

# Root level (directly in portfolio directory)
create_java_class "." "PortfolioServiceApplication"

# config/ package
create_java_class "config" "CorsConfig"

# controller/ package
create_java_class "controller" "AboutController"
create_java_class "controller" "InstagramController"
create_java_class "controller" "SkillController"
create_java_class "controller" "WebLinkController"

# dto/ package
create_java_class "dto" "InstagramPostDto"
create_java_class "dto" "WebLinkRequestDto"

# exception/ package
# Note: Corrected typo from 'execption' to 'exception' based on your initial tree structure
create_java_class "exception" "GlobalExceptionHandler"
create_java_class "exception" "NotFoundException"
create_java_class "exception" "PortfolioException"

# model/ package
create_java_class "model" "About"
create_java_class "model" "InstagramPost"
create_java_class "model" "Skill"
create_java_class "model" "WebLink"

# repository/ package
create_java_class "repository" "AboutRepository"
create_java_class "repository" "InstagramPostRepository"
create_java_class "repository" "SkillRepository"
create_java_class "repository" "WebLinkRepository"

# service/ package
create_java_class "service" "AboutService"
create_java_class "service" "InstagramService"
create_java_class "service" "SkillService"
create_java_class "service" "WebLinkService"

# transformer/ package
create_java_class "transformer" "InstagramPostTransformer"

echo ""
echo "Script finished. All specified Java class files have been created."
echo "You should now see the files directly within your existing package directories."
