package com.example.splashscreen

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class Custommenu {
    fun customMenu(context: Context,view: View){
        val pop=PopupMenu(context,view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.experince ->{ Toast.makeText(context,"clicked Experienced",Toast.LENGTH_SHORT).show()
                true
                }
                R.id.achievement ->{ Toast.makeText(context,"clicked Achievement",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.academics ->{ Toast.makeText(context,"clicked Academics",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.hobbies ->{ Toast.makeText(context,"clicked Hobbies",Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.about_you -> { Toast.makeText(context, "clicked About You", Toast.LENGTH_SHORT).show()
                    true
                }
                else ->false
            }

        }
    }

    }
