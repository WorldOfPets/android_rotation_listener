package com.example.myapplication.ui

import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.createSupabaseClient

class MyDB {
    companion object{
        val connection = createSupabaseClient(
            supabaseUrl = "https://cjfluxsuthqktabwgssp.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImNqZmx1eHN1dGhxa3RhYndnc3NwIiwicm9sZSI6ImFub24iLCJpYXQiOjE2OTQyNDkyMzYsImV4cCI6MjAwOTgyNTIzNn0.tVLr2proLKU6tkrQtPsZJJLc0jMfPsyYbEwtkj3Ffu8"
        ) {
            install(Auth)
            install(Postgrest)
            //install other modules
        }
    }
}